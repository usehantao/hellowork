package Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class ReflecHomeWork02 {
	public static void main(String[]args) throws Exception{
		Class<?>fileCls = Class.forName("java.io.File");	
		//�õ����еĹ�����
		Constructor<?>[] dct = fileCls.getDeclaredConstructors();
		//�������
		for(Constructor<?> dc : dct){
			System.out.println("File������= " + dct);
			}
	
		//ָ���õ�public  java.io.File(java.lang.String);
		Constructor<?> dt = fileCls.getDeclaredConstructor(String.class);
		String fileAllPath ="e:\\mynew.txt";
		 Object o = dt.newInstance(fileAllPath); //Object����һ���ļ������� ,����File����
		Method creat = fileCls.getMethod("creatNewFile");
		creat.invoke(o);
		Object file;
		System.out.println("�����ļ��ɹ�" +fileAllPath );
		}
}
