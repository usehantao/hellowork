import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction_{
		public void uesTransaction() throws Exception{
		
		Connection connection = null;
		String sql ="update account set balance = blance-100 where id = 1";
		String sql2 ="update account set balance =balance+100 where id =2";

		PreparedStatement preparedStatement =null;

		try{
		connection =JDBCUtils_.getConnection();
		//将connection设置为不自动提交
		connection.setAutoCommit(false);//开启了事务
		preparedStatement =connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
		
		preparedStatement =connection.prepareStatement(sql2);
		preparedStatement.executeUpdate();
		
		//提交事务
		connection.commit();
		}catch(Exception e){
		//这里我可以进行回滚，撤销执行的SQL
		//默认回滚到事务开始的状态
		connection.rollback();
		e.printStackTrace();
		}finally{
		JDBCUtils_.close(null,preparedStatement,connection);
			}
		}
}