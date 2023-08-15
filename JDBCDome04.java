import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCDome04<Emp>{
	public static void main(String[]args){
		List<Emp> list = new JDBCDome04().findALL();
		System.out.println(list);
	}
		//查询所有emp对象
		public List<Emp> findALL(){
	
		ResultSet rs =null;
		Statement stmt=null;
		Connection conn=null;
		List<Emp> list =null;
		
		try{
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取连接
		conn = DriverManager.getConnection("jdbc:////db3","root","root");
		//3.定义sql
		String sql ="select * from emp";
		//4.获取执行sql对象
		stmt = conn.createStatement();
		//5.执行sql
		rs = stmt.executeQuery(sql);
		//6.遍历结果集，封装对象，装载集合
		Emp emp = null;
		list = new ArrayList<Emp>();
		while(rs.next()){
		//获取数据
		int id = rs.getInt("id");
		String name = rs.getString("ename");
		int job_id = rs.getInt("job_id");
		int mgr = rs.getInt("mgr");
		Date joindate = rs.getDate("joindate");
		//创建emp对象,并赋值
		emp = new Emp();
		emp.setId(id);
		emp.setEname(ename);
		emp.setJob_id(job_id);
		emp.setMgr(mrg);
		emp.setJoindate(joindate);

		//装载集合
		list.add(emp);
		}

		}catch(ClassNotFoundException e({
		e.printStackTrace();
		}catch(SQLException e){
		e.printStackTrace();
		}finally{
		if(conn != null){
		conn.close();
		}
		if(stmt !=null){
		stmt.close();
		}
		if(rs != null){
		rs.close();
		}
		}
		return list;
		}
}