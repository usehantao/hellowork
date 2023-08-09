import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.CommonDataSource;

import org.junit.Test;

public class C3P0_{
	//方式1.相关的参数，在程序中指定user ,url,password等
		@Test
		public void testC3P0_01(){
		//创建数据源对象
		CombopooleDataSource cp = new CombopooleDataSource();
		//获取相关连接信息
		Properties properties = new Properties();
		properties.load(new FileInputStream("src\\mysql.properties"));
		//读取相关信息
		String user =properties.getProperty("user");
		String password =properties.getProperty("password");
		String url =properties.getProperty("url");
		String driver =properties.getProperty("driver");
		//给数据源CombopooleDataSource设置相关参数
		//注意：我们连接的管理是由CombopooleDataSource 管理的
		cp.setDriverClass(driver);
		cp.setJdbcUrl(url);
		cp.setUser(user);
		cp.setPassword(password);
		//设置初始化连接数
		cp.setInitialPoolSize(10);
		//最大连接数
		cp.setMaxPoolSize(50);
		//测试连接池的效率
		for(int i =0 ;i<5000;i++){
		Connection connection  = cp.getConnection();
		System.out.println("连接成功");
		connection.close();
			}
		}
		
		//方式二： 使用配置文件模板来完成操作
		//将c3p0提供的配置文件，c3p0.config.xml 拷贝到src目录下
		//该文件指定了连接数据库和连接池的相关参数
		@Test
		public void testC3P0_02(){
		CombopooleDataSource cp2 = new CombopooleDataSource("ht_edu");
		
		Connection connection =cp2.getConnection();
		System.out.println("连接成功");
		connection.close();
		}
}