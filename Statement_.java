import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Statement_{
	public static void  main(String[]args) throws Exception{
		Scanner scr = new Scanner(System.in);
		//让用户输入管理员密码
		String admin_name =scr.nextLine(); //next方法当接收空格或者‘ 表示结束
		String adimn_password  = scr.nextLine();
		
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
				String sql ="select name , password from adim where name= '" +admin_name+ "'and password =' " + adimn_password +"'";
				//执行给定的sql语句，该语句返回单个ResultSet对象
				ResultSet resultset = statement.executeQuery(sql);
				
				if(resultset.next()) {//如果查询到一条记录，则说明该用户存在
					System.out.println("登录成功");
					
				}else {
					System.out.println("登录失败");
				}
				resultset.close();
				connection.close();
				statement.close();
				
	}
}