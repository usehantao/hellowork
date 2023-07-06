package Class;



import java.lang.reflect.Field;

import question.Car;

public class Class01 {
	public static void main(String[]args) throws Exception {
		
		String classAllPath = "question.Car";
		//获取到Car类，对应的class对象。
		//<?>表示不确定的Java类型
		Class<?> cls = Class.forName(classAllPath);
		System.out.println(cls);//显示cls 对象是哪个类的class对象 
		System.out.println(cls.getClass()); //输出cls运行类型， java.lang.Class
		//得到包名
		System.out.println(cls.getPackageName());
		//得到全类名
		System.out.println(cls.getName());
		//通过cls来创建一个对象实例
		Object o = (Car)cls.newInstance();
		System.out.println(o); //car.toString
		//通过反射获取属性、
		Field brand = cls.getField("brand");
		System.out.println(brand.get(o)); 
		//通过反射给属性赋值
		brand.set(o, "奔驰");
		System.out.println(brand.get(o)); 
		//得到所有的属性(字段)
		System.out.println("======所有字段属性==========");
		Field[]  fields = cls.getFields();
		for(Field f  : fields) {
			System.out.println(f.getName());  //依次输出属性字段的各个名称
		}
		
			 
		
	}
}
