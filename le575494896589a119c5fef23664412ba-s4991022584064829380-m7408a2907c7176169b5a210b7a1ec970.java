package ReflectDemo;

import java.io.FileOutputStream;
import java.io.PrintStream;

import com.sun.jdi.Field;

public class Mybatis {
	
	public static void save(Object obj){
		
		
		try {
		PrintStream ps = new PrintStream(new FileOutputStream("e://hhhh.txt" ,true));
		Class c = obj.getClass();
		ps.println("==========="+c.getSimpleName()+"============="); //��ȡ��ǰ����
		//2.��Ȩȫ����Ա����
		java.lang.reflect.Field[] fields =c.getDeclaredFields();
		//3.��ȡ��Ա��������Ϣ
		for(java.lang.reflect.Field field : fields) {
			String name = field.getName();
			//4.��ȡ����Ա������OBJ�����ֵ
			
			field.setAccessible(true); //��������
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

