import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCUtils_Use{
	
	public static void main(String[]args){
		
	}
	public void testDml(){ //insert,update,delect
	//1.得到连接
	Connection conneticon =null;
	//2.组织sql语句
	String sql ="update actor set name = ? where id =?";
	//3.创建一个PerparedStatement对象
	PreparedStatement preparedStatement =null;
	try{
	conneticon =JDBCUtils_.getConnection();
	preparedStatement = conneticon.prepareStatement(sql);
	//给占位符赋值
	preparedStatement.setString(1,"发财");
	preparedStatement.setInt(2,4);
	//执行
	preparedStatement.executeUpdate();
	}catch(Exception throwables){
	throwables.printStackTrace();
	}finally{
	//关闭资源
	JDBCUtils_.close(null,preparedStatement,conneticon);
	}
	}
}