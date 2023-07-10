package Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class ReflecHomeWork02 {
	public static void main(String[]args) throws Exception{
		Class<?>fileCls = Class.forName("java.io.File");	
		//得到所有的构造器
		Constructor<?>[] dct = fileCls.getDeclaredConstructors();
		//遍历输出
		for(Constructor<?> dc : dct){
			System.out.println("File构造器= " + dct);
			}
	
		//指定得到public  java.io.File(java.lang.String);
		Constructor<?> dt = fileCls.getDeclaredConstructor(String.class);
		String fileAllPath ="e:\\mynew.txt";
		 Object o = dt.newInstance(fileAllPath); //Object就是一个文件对象了 ,创建File对象。
		Method creat = fileCls.getMethod("creatNewFile");
		creat.invoke(o);
		Object file;
		System.out.println("创建文件成功" +fileAllPath );
		}
}
