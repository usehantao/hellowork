package ThreadPool;

public class MyRunnable implements Runnable {
	@Override
	public void run(){
	for(int i = 0 ;i <5 ; i++){
	System.out.println(Thread.currentThread().getName() + "HelloWorld" + i);
	
		}

		try {
			System.out.println(Thread.currentThread().getName() + "���������̰߳󶨣��߳̽�������ģʽ" );
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
