package Class;

import java.lang.reflect.Constructor;

public class ReflecCreateInstance {
		public static void main(String[]args ) throws Exception {
	//1.��ȡuser���class����
	Class cls =  Class.forName("Class.User");
	
	//2.ͨ��public �޲ι���������ʵ��
	Object o = cls.newInstance();
	System.out.println(o);
	//3.ͨ��public �вι���������ʵ��
	//con�������public User(String name )  ������
	Constructor<?> con = cls.getConstructor(String.class);
	Object o1 = con.newInstance("huahua");
	System.out.println(o1);
	//4.ͨ��˽�еĹ���������ʵ��
	//getDeclaredConstructor���Է������еĹ���������
	Constructor<?> con1 = cls.getDeclaredConstructor(int.class,String.class);
	//����ʵ��
	con1.setAccessible(true);//���ƣ�ʹ�÷�����Է���private������/����/����
	Object o2 = con1.newInstance(100,"С��");
	System.out.println(o2);
		}
	
		
}



class User{
	private  int  age =10;
	private String name = "facai";
	
	public User() {
		
	}
	
	public User(String name ) {
		this.name =name;
	}

	private User(int age ,String name) {
		this.age =age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	
}
