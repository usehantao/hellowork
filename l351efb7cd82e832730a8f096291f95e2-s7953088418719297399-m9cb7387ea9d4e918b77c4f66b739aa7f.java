package ProxyDome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
	//生产业务对象的代理对象
		/*public static UserService getProxy(UserServiceImpl userService){
		retrun null ;
		参数一：类加载器，负责加载代理类到内存中使用
		参数二：获取被代理对象实现的全部接口,代理要为接口的全部方法进行代理
		参数三：代理的核心逻辑

		*/
		public static UserService getProxy(UserService obj){
		//返回了一个代理对象
		return(UserService) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces() ,
		(InvocationHandler) new InvocationHandler(){
		public Object invoke1(Object proxy ,Method method ,Object[]args) throws Throwable{
			//参数二：正在被代理的方法
			//参数三：被代理方法，应该传入的参数
			long statrTime =System.currentTimeMillis();
			//触发方法
			Object  result = method.invoke(obj,args);
			long statrTime1 =System.currentTimeMillis();
			System.out.println(method.getName() +"方法耗时:" + (statrTime1 - statrTime)/1000.0+ "s");
			//业务功能方法执行的结果返回	
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
