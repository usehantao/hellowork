package Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.sun.jdi.Method;

public class ReflecHomeWork01 {
	public static void main(String[]args) throws Exception{
		Class<PrivateTest> cls = PrivateTest.class;
		//创建对象实例
		PrivateTest obj = cls.newInstance();
		//得到name属性
		Field name  = cls.getDeclaredField("name");
		//爆破
		name.setAccessible(true);
		name.set(obj,"mantou");
		//得到getname方法对象
		java.lang.reflect.Method get = cls.getMethod("getName");
		//getName方法是pubilc 直接调用
		Object invoke =  get.invoke(obj);
		System.out.println("name属性值= " +invoke);
		
		}
}

class PrivateTest{
	private String name = "hello,facai";
	//默认无参构造器
	public String getName(){
	return name;
	}
}