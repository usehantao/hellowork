package ProxyDome;

import java.lang.reflect.Proxy;

public class Test {
	

	

	public static void main(String[]args){
		
			
		
		//1.��ҵ��������ɴ�����󷵻أ�������������Ҳ��UserService���͡�
		UserService us = ProxyDemo.getProxy(new UserServiceImpl());
		String rs = us.login("facai","1234");
		System.out.println(rs);
		System.out.println(us.deleteUsers());
		us.selectUsers();
		}
}
