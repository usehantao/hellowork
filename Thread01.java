package com.jiheDome;

public class Thread01 {
	public static void main(String[]args) throws Exception {
		//创建一个cat对象，可以当作线程使用
		Cat cat1 = new Cat();
		cat1.start();//启动线程
		//当mian线程启动一个子线程后，程序不会阻塞在start方法
		System.out.println("主线程继续执行" +Thread.currentThread().getName());
		for(int i =0 ;i<15;i++) {
			System.out.println("i =" +i);
			Thread.sleep(1000);
			
		}
				
		
	}
}

//当一个类继承了Thread 该类就可以当作线程使用
//一般会重写run方法，写上自己的业务代码
//run Thread 类 实现了Runnable接口的run方法
class Cat extends Thread{
	int times = 0; 
	@Override
	public void run() {//重写run方法，写上自己的业务逻辑
		
		while(true) {
		System.out.println("喵喵，我是小猫咪" +(times)+"线程名称"+Thread.currentThread().getName());
		//休眠1秒
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		times ++;
		if(times >20) {
			break;
		}
		}
		
	}
}