package ReflectDemo;

public class ReflectDemo01 {
	public static void main(String[]args){
		Student s = new Student();
		s.setName("����");
		s.setClassName("����������");
		s.setAge(10);
		s.setHobby("�Է�˯��");
		s.setSex('Ů');
		Mybatis.save(s);

		Teacher t = new Teacher();
		t.setName("��ͷ");
		t.setSex('��');
		t.setSalary(5000);	
		Mybatis.save(t);
		}
}
