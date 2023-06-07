package ProxyDome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
	//����ҵ�����Ĵ������
		/*public static UserService getProxy(UserServiceImpl userService){
		retrun null ;
		����һ�����������������ش����ൽ�ڴ���ʹ��
		����������ȡ���������ʵ�ֵ�ȫ���ӿ�,����ҪΪ�ӿڵ�ȫ���������д���
		������������ĺ����߼�

		*/
		public static UserService getProxy(UserService obj){
		//������һ���������
		return(UserService) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces() ,
		(InvocationHandler) new InvocationHandler(){
		public Object invoke1(Object proxy ,Method method ,Object[]args) throws Throwable{
			//�����������ڱ�����ķ���
			//������������������Ӧ�ô���Ĳ���
			long statrTime =System.currentTimeMillis();
			//��������
			Object  result = method.invoke(obj,args);
			long statrTime1 =System.currentTimeMillis();
			System.out.println(method.getName() +"������ʱ:" + (statrTime1 - statrTime)/1000.0+ "s");
			//ҵ���ܷ���ִ�еĽ������	
			return result;
				}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// TODO Auto-generated method stub
			return null;
		}
			});
		}
}
