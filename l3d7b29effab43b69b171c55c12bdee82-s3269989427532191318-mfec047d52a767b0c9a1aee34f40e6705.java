package ReflectDemo;

public class ReflectDemo01 {
	public static void main(String[]args){
		Student s = new Student();
		s.setName("花花");
		s.setClassName("发财在哪里");
		s.setAge(10);
		s.setHobby("吃饭睡觉");
		s.setSex('女');
		Mybatis.save(s);

		Teacher t = new Teacher();
		t.setName("馒头");
		t.setSex('男');
		t.setSalary(5000);	
		Mybatis.save(t);
		}
}
