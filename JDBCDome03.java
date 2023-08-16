import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDome03{
	public static void main(String[]args){

		Statement  stmt = null;
		Connection conn =null;
		ResultSet rs = null;
	try{
		//1.注册驱动
		Class.forName("com.mysq.jdbc.Driver");
		//定义sql
		String sql ="select * from account";
		//获取Connection对象
		conn =DriverManager.getConnection("jdbc:////db3","root","root");
		//获取执行sql对象
		stmt = conn.createStatement();
		//执行sql
		 rs = stmt.excuteQuery(sql);
		//处理结果
		rs.next();
		//获取数据
		while(rs.next()){
		//循环判断是否有下一行
		//获取数据
		int id =rs.getInt(1);
		String name =rs.getString("name");
		double balance =rs.getDouble(3);
		System.out.println(id +"----"+name+"----"+balance);
		
		}
		}catch(Exception){
		e.printStackTrace();
		}catch(SQLException){
		e.printStackTrace();
				}finally{
		//释放资源
		if(stmt != null){
		stmt.close();
		}
		if(conn != null){
		conn.close();
			}
		if(rs != null){
		conn.close();
			}
				}
			}
}