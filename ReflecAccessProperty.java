package Class;

import java.lang.reflect.Field;

public class ReflecAccessProperty {
	public static void main(String[]args) throws Exception {
		//1.得到student 对应的class对象
		Class<?> clas = Class.forName("Class.Student");
		//2.创建一个对象
		Object o = clas.newInstance(); //o的运行类型已经是Student
		//3.使用反射得到age对象
		Field age = clas.getField("age");
		age.set(o, 100); //通过反射来设置属性
		System.out.println(o);
		System.out.println(age.get(o));
		//使用反射操作私有静态属性
		Field name = clas.getDeclaredField("name");
		//对name进行爆破
		name.setAccessible(true);
		name.set(o, "facai"); //因为name是static属性，因此这里O也可以写出null
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
