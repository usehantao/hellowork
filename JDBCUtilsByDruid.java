import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

public class JDBCUtilsByDruid{
	
	private static DataSource ds;
	
	//在静态代码块完成ds的初始化
	static{
	Properties properties = new Properties();
	try{
	properties.load(new FileInputStream("src\\druid.properties"));
	ds= DruidDataSourceFactory.createDataSource(properties);
	}catch(Exception e){
	e.printStackTrace();
	}
	}
	//编写getConnection方法
	public static Connection getConnection(){
	return ds.getConnection();
}
	//关闭连接	,在连接池技术中，close方法不是真的断掉连接，而是将使用的链接对象放回连接池
	public static void close(ResultSet resultSet,Statement statement,Connection connection){
	if(resultSet !=null){
	resultSet.close();	
	}
	if(statement !=null){
	statement.close();	
	}
	if(connection !=null){
	connection.close();	
	}
	}
	
}