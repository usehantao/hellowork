import java.util.List;

import org.junit.Test;

public class FanXingTest{
	public static void main(String[]args) {
		
		
		
	}
	@Test
	public void testList() {
		DAO<User>Dao =new DAO<>();
		Dao.save("001", new User(1,18,"facai"));
		Dao.save("002", new User(2,18,"huahua"));
		Dao.save("003", new User(3,18,"huahau"));
		
		List<User>list = Dao.list();
		System.out.println("list =" + list);
		
		}
}