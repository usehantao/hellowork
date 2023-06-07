package ProxyDome;

import java.lang.reflect.Proxy;

public class Test {
	

	

	public static void main(String[]args){
		
			
		
		//1.把业务对象做成代理对象返回，代理对象的类型也是UserService类型。
		UserService us = ProxyDemo.getProxy(new UserServiceImpl());
		String rs = us.login("facai","1234");
		System.out.println(rs);
		System.out.println(us.deleteUsers());
		us.selectUsers();
		}
}
