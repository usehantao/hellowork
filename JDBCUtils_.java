import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.spi.DirStateFactory.Result;

public class JDBCUtils_{
	
	//定义相关的属性（4个），因为只需要一份，因此做成静态的
		private static String user;
		private static String password;
		private static String url;
		private static String driver;
		
		//在static 代码去初始化
		static{
		try{
		Properties properties = new Properties();
		properties.load(new FileInputStream("src://mysql.properties"));
		//读取相关属性
		user =properties.getProperty("user");
		password =properties.getProperty("password");
		url =properties.getProperty("url");
		driver =properties.getProperty("driver");
		}catch(Exception e){
		 throw new RuntimeException(e);
			}
		}
		//连接数据库,返回connection
		public static Connection getConnection(){
		try{
		return DriverManager.getConnection(url,user,password);
		}catch(Exception e){
		 throw new RuntimeException(e);
			}
		}
		//关闭相关资源
		public static void close(ResultSet set,Statement statement,Connection connection){
		//判断是否为空
		try{
		if(set != null){
		set.close();
		}
		if(statement != null){
		statement .close();
		}
		if(connection != null){
		connection .close();
		}
		}catch(Exception e){
		 throw new RuntimeException(e);
			}
		}
}