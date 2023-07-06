package Class;



import java.lang.reflect.Field;

import question.Car;

public class Class01 {
	public static void main(String[]args) throws Exception {
		
		String classAllPath = "question.Car";
		//��ȡ��Car�࣬��Ӧ��class����
		//<?>��ʾ��ȷ����Java����
		Class<?> cls = Class.forName(classAllPath);
		System.out.println(cls);//��ʾcls �������ĸ����class���� 
		System.out.println(cls.getClass()); //���cls�������ͣ� java.lang.Class
		//�õ�����
		System.out.println(cls.getPackageName());
		//�õ�ȫ����
		System.out.println(cls.getName());
		//ͨ��cls������һ������ʵ��
		Object o = (Car)cls.newInstance();
		System.out.println(o); //car.toString
		//ͨ�������ȡ���ԡ�
		Field brand = cls.getField("brand");
		System.out.println(brand.get(o)); 
		//ͨ����������Ը�ֵ
		brand.set(o, "����");
		System.out.println(brand.get(o)); 
		//�õ����е�����(�ֶ�)
		System.out.println("======�����ֶ�����==========");
		Field[]  fields = cls.getFields();
		for(Field f  : fields) {
			System.out.println(f.getName());  //������������ֶεĸ�������
		}
		
			 
		
	}
}
