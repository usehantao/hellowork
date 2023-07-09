package Class;

import java.lang.reflect.Field;

public class ReflecAccessProperty {
	public static void main(String[]args) throws Exception {
		//1.�õ�student ��Ӧ��class����
		Class<?> clas = Class.forName("Class.Student");
		//2.����һ������
		Object o = clas.newInstance(); //o�����������Ѿ���Student
		//3.ʹ�÷���õ�age����
		Field age = clas.getField("age");
		age.set(o, 100); //ͨ����������������
		System.out.println(o);
		System.out.println(age.get(o));
		//ʹ�÷������˽�о�̬����
		Field name = clas.getDeclaredField("name");
		//��name���б���
		name.setAccessible(true);
		name.set(o, "facai"); //��Ϊname��static���ԣ��������OҲ����д��null
		System.out.println(o);
		System.out.println(name.get(null));	
	}
}



class Student{
	public int age;
	private static String name;
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", nam e=" + name + "]" ;
	}

 
	
}
