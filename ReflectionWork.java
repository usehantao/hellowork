package com.jiheDome;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionWork {
	public static void main(String[]args) throws Exception, Exception{
		 Class cls = PrivateTest.class;
		 //创建对象实例
		 Object obj = cls.newInstance();
		 //name属性是私有的 使用getDeclaredFiled
		 Field name = cls.getDeclaredField("name");
		 //爆破
		 name.setAccessible(true);
		 name.set(obj,"发财");
		 //得到getName对象
		 Method getName = cls.getMethod("getName");
		 Object invoke = getName.invoke(obj);
		 System.out.println(invoke);
		 }


}
class PrivateTest{
	 private String name = "hellokity";
	 public String getName(){
	 return name;
	 }
	}