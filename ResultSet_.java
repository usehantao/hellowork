import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ResultSet_{
	
	public static void main(String[]args) throws IOException, Exception {
		//获取相关值
		Properties properties  = new Properties();
		properties.load(new FileInputStream("src\\mysql.propertiese"));
		
		String user =properties.getProperty("user");
		String password =properties.getProperty("password");
		String driver = properties.getProperty("driver");
		String url =properties.getProperty("url");
		//注册驱动
		Class.forName(driver);
		//得到连接
		Connection connection =DriverManager.getConnection(url,user,password);
		//得到statement
		Statement statement  =connection.createStatement();
		//组织sql语句
		String sql ="select id,name,sex,borndate from actor";
		//执行给定的sql语句，该语句返回单个ResultSet对象
		ResultSet resultset = statement.executeQuery(sql);
		//使用while取出数据
		while(resultset.next()) {
			int id = resultset.getInt(1);//获取该行的第一列
			String name = resultset.getString(2);
			String sex = resultset.getString(3);
			Date date =resultset.getDate(4);
			System.out.println(id +"\t" +name +"\t" +sex +"\t" +date );
					
		}
		
		//关闭连接
		resultset.close();
		statement.close();
		connection.close();
		
		
		
		
	}
}