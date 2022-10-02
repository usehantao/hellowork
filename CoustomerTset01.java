public class CoustomerTset01{
	
	public static void main(String[]args) {
		
		//创建Custmoer对象
		
		CoustomerTest ht =new CoustomerTest ();
		ht.name="韩涛";
		ht.shopping();
		
		
		//再创建Custmoer对象
		CoustomerTest wjm =new CoustomerTest ();
		wjm.name="王建明";
		wjm.shopping();
		
		CoustomerTest.run();
		
		
		
		
	}
}