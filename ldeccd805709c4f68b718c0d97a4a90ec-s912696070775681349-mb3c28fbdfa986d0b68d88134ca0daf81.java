package ThreadTest;

public class ThreadDemo05 {
	public static void main(String[]args) {
		//1.定义一个想线程类，创建一个共享账户
		Account acc =new Account("ICBC" ,  100);
		//2.创建2个线程对象
		new DrawThread(acc,"发财").start();
		new DrawThread(acc,"馒头").start();
		}
	}

