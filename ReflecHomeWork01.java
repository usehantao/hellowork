package Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.sun.jdi.Method;

public class ReflecHomeWork01 {
	public static void main(String[]args) throws Exception{
		Class<PrivateTest> cls = PrivateTest.class;
		//��������ʵ��
		PrivateTest obj = cls.newInstance();
		//�õ�name����
		Field name  = cls.getDeclaredField("name");
		//����
		name.setAccessible(true);
		name.set(obj,"mantou");
		//�õ�getname��������
		java.lang.reflect.Method get = cls.getMethod("getName");
		//getName������pubilc ֱ�ӵ���
		Object invoke =  get.invoke(obj);
		System.out.println("name����ֵ= " +invoke);
		
		}
}

class PrivateTest{
	private String name = "hello,facai";
	//Ĭ���޲ι�����
	public String getName(){
	return name;
	}
}