package ReflectDemo;

import java.io.FileOutputStream;
import java.io.PrintStream;

import com.sun.jdi.Field;

public class Mybatis {
	
	public static void save(Object obj){
		
		
		try {
		PrintStream ps = new PrintStream(new FileOutputStream("e://hhhh.txt" ,true));
		Class c = obj.getClass();
		ps.println("==========="+c.getSimpleName()+"============="); //获取当前类名
		//2.提权全部成员变量
		java.lang.reflect.Field[] fields =c.getDeclaredFields();
		//3.获取成员变量的信息
		for(java.lang.reflect.Field field : fields) {
			String name = field.getName();
			//4.提取本成员变量在OBJ对象的值
			
			field.setAccessible(true); //暴力反射
			String value = field.get(obj) +" ";
			ps.println(name + "=" +value );
			
			}
			ps.close();
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

