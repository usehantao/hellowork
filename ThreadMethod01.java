package com.jiheDome;

public class ThreadMethod01 {
	public static void main(String[]args) throws Exception {
	T2 t2 = new T2();
	t2.start();
	for(int i =1 ;i<= 20; i++) {
		Thread.sleep(1000);
		System.out.println("主线程吃了"+i +"个包子");
		if(i==5) {
			System.out.println("主线程吃了5个包子，让子线程先吃");
			t2.join();//这里相当与t2子线程先执行完毕 插队
			System.out.println("子线程吃完了，继续吃");
			
		}
	}
		
}
}

class T2 extends Thread{
	@Override
	public void run() {
		for(int i = 1 ;i<=20 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("子线程吃了"+ i +"个包子");
		}
	}

}