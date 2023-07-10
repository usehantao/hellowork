package Class;

import java.lang.reflect.Method;

public class ReflceAccessMethod {
	public static void mian(String[]args) throws Exception{
		//1.得到boss类对应的class对象
		Class<?> clas = Class.forName("Class.Boss");
		//2.创建对象
		Object o = clas.newInstance();
		//3.调用public 方法
		//Mehtod hi = clas.getMethod("hi" ,String.class); //获取公有的方法
		//4.得到hi方法对象
		Method hi =clas.getDeclaredMethod("hi" , String.class); //获取所有的方法
		hi.invoke(o,"facai");
		//5.调用private static 方法
		Method say =clas.getDeclaredMethod("say" , int.class,String.class ,char.class); 
		//因为say方法为私有，所以需要爆破调用
		say.setAccessible(true);
		System.out.println(say.invoke(o,100,"huahua", 'n'));
		//返回值:在反射中，如果方法有返回值，统一返回Object ，运行类型和方法定义的返回类型值一致。
		Object reVal = say.invoke(null , 500 ,"mantou" ,'h');
		System.out.println("Vale的运行类型 =" + reVal.getClass()); //String
		}
}

class Boss{
	public int age;
	private static String name;
	
	public Boss(){
	}

	private static String say(int n, String s, char c){  //静态方法
	return n+" " + s+" " +c;
	}
	public void hi(String s){   //普通方法
	System.out.println("hi" +s);
	}
}