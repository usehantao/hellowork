import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class testSelect{
	public static void main(String[]args){
		
	}
	public void testSelect(){ //insert,update,delect
	//1.得到连接
	Connection conneticon =null;
	//2.组织sql语句
	String sql ="select * from actor ";
	//3.创建一个PerparedStatement对象
	PreparedStatement preparedStatement =null;
	ResultSet set =null;
	try{
	conneticon =JDBCUtils_.getConnection();
	preparedStatement = conneticon.prepareStatement(sql);
	//执行
	set = preparedStatement.executeQuery();
	//遍历该结果集
	while(set.next()){
	int id =set.getInt("id");
	String name =set.getString("name");
	String sex =set.getString("sex");
	Date borndate =set.getDate("borndate");
	String phone = set.getString("phone");
	System.out.println(id + "\t"+ name+"\t"+sex+"\t"+borndate+"\t"+phone);
	}
	}catch(Exception throwables){
	throwables.printStackTrace();
	}finally{
	//关闭资源
	JDBCUtils_.close(set,preparedStatement,conneticon);
	}
	}
}