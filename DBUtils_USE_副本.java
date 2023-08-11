import java.sql.Connection;
import java.util.List;

import org.junit.Test;

public class DBUtils_USE{
	
	@Test
	public void testQueryMany(){ //返回结果是多行数据
	//得到连接
	Connection  connection = JDBCUtilsByDruid.getConnection();
	//使用DBUtils类和接口 引入相关JAR文件
	//创建QueryRunner
	QueryRunner queryRunner = new QueryRunner();
	//可以执行相关的方法，放回一个ArrayList结果集
	String sql ="select * from actor where id =?";
	//query方法就是执行一个sql语句得到resultSet ,封装到ArrayList集合中然后返回。
	// 1 就是给SQL 语句中的问号赋值，可以有多个值，是可变参数。
	List<Actor>List= queryRunner.query(connection,sql,new BeanListHandler<>(Actor.class),1);
	for(Actor actor : list){
	System.out.println(actor);
	}
	//释放资源
	JDBCUtilsByDruid.close(null,null,connection);
	}
	
		//演示Apache +druid完成 返回 的结果是单行记录
		@Test
		public void testQuerySingle(){
		//得到连接
		Connection  connection = JDBCUtilsByDruid.getConnection();
		//创建QueryRunner
		QueryRunner queryRunner = new QueryRunner();
		String sql ="select * from actor where id =?";
		//因为我们返回的单行记录 ，单个对象，使用的Hander是Beanhandler
		Actor actor = queryRunner.query(connection ,sql ,new BeanHandler<>(Actor.class),4);
		System.out.println(actor);
		//释放资源。
		JDBCUtilsByDruid.close(null,null,connection);

		}
		
		//演示Apache +druid完成 返回 的结果是单行单例记录 返回的是Object
		@Test
		public void testScalar(){
		//得到连接
		Connection  connection = JDBCUtilsByDruid.getConnection();
		//创建QueryRunner
		QueryRunner queryRunner = new QueryRunner();
		String sql ="select name from actor where id =?";
		//因为返回的是个对象 使用的Hander是ScalarHandler
		Object obj = queryRunner.query(connection ,sql ,new ScalarHandler<>(Actor.class),4);
		System.out.println(obj);
		//释放资源。
		JDBCUtilsByDruid.close(null,null,connection);
		}
		
		
		//演示Apache +druid完成 DML(update,insert,delete)操作
		@Test
		public void testDml(){
		//得到连接
		Connection  connection = JDBCUtilsByDruid.getConnection();
		//创建QueryRunner
		QueryRunner queryRunner = new QueryRunner();
		//组织SQL语句
		String sql ="update actor set name =? where id =?";
		//String sql ="insert into actor values =(null, ? ,?,?,?)";
		
		//执行dml操作使用方法update，也可以使用insert和delete，返回值是受影响的行数。
		int affectedRow = queryRunner.update(connection,sql,"发财","男","1991-09-19","116");
		//int affectedRow = queryRunner.update(connection,sql,"发财",4);
		System.out.println(affected >0? "执行成功" :"执行未影响到表");
		
		//释放资源。
		JDBCUtilsByDruid.close(null,null,connection);
		}
		
		
}

