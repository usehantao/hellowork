package Class;

import java.lang.reflect.Method;

public class ReflceAccessMethod {
	public static void mian(String[]args) throws Exception{
		//1.�õ�boss���Ӧ��class����
		Class<?> clas = Class.forName("Class.Boss");
		//2.��������
		Object o = clas.newInstance();
		//3.����public ����
		//Mehtod hi = clas.getMethod("hi" ,String.class); //��ȡ���еķ���
		//4.�õ�hi��������
		Method hi =clas.getDeclaredMethod("hi" , String.class); //��ȡ���еķ���
		hi.invoke(o,"facai");
		//5.����private static ����
		Method say =clas.getDeclaredMethod("say" , int.class,String.class ,char.class); 
		//��Ϊsay����Ϊ˽�У�������Ҫ���Ƶ���
		say.setAccessible(true);
		System.out.println(say.invoke(o,100,"huahua", 'n'));
		//����ֵ:�ڷ����У���������з���ֵ��ͳһ����Object ���������ͺͷ�������ķ�������ֵһ�¡�
		Object reVal = say.invoke(null , 500 ,"mantou" ,'h');
		System.out.println("Vale���������� =" + reVal.getClass()); //String
		}
}

class Boss{
	public int age;
	private static String name;
	
	public Boss(){
	}

	private static String say(int n, String s, char c){  //��̬����
	return n+" " + s+" " +c;
	}
	public void hi(String s){   //��ͨ����
	System.out.println("hi" +s);
	}
}