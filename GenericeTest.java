import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericeTest{
	public static void main(String[]args) {
		
		
	
	}
	@Test
	public void testList() {
		//给泛型t指定类型是 User
		  Dao<User> bojectDao = new Dao<>();
		  bojectDao.save("001", new User(1,10,"facai"));
		  bojectDao.save("002", new User(2,15,"huahua"));
		  bojectDao.save("003", new User(3,16,"mantou"));
		  
		  List<User>list = bojectDao.list();
		  System.out.println("list =" + list);
		  bojectDao.update("003", new User(3,18,"xiaobao"));
		  list = bojectDao.list();
		  System.out.println("list =" + list);
		  
		 
	}
	
}