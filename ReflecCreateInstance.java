package Class;

import java.lang.reflect.Constructor;

public class ReflecCreateInstance {
		public static void main(String[]args ) throws Exception {
	//1.获取user类的class对象
	Class cls =  Class.forName("Class.User");
	
	//2.通过public 无参构造器创建实例
	Object o = cls.newInstance();
	System.out.println(o);
	//3.通过public 有参构造器创建实例
	//con对象就是public User(String name )  构造器
	Constructor<?> con = cls.getConstructor(String.class);
	Object o1 = con.newInstance("huahua");
	System.out.println(o1);
	//4.通过私有的构造器创建实例
	//getDeclaredConstructor可以返回所有的构造器对象
	Constructor<?> con1 = cls.getDeclaredConstructor(int.class,String.class);
	//创建实例
	con1.setAccessible(true);//爆破，使用反射可以访问private构造器/方法/属性
	Object o2 = con1.newInstance(100,"小白");
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
