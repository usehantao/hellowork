public class Thread01{
	//mian 线程启动两个子线程
	public static void main(String[]args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		Thread thread1 =new Thread(t1);
		Thread thread2 =new Thread(t2);
		thread1.start();
		thread2.start();
		
		
	}
}

class T1 implements Runnable{
	int count = 0;
	@Override
	public void run() {
		while(true) {
		System.out.println("发财在哪里" +  (++count));
		try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		if(count == 10) {
			break;
		}
  }
 }
}

class T2 implements Runnable{
	int count = 0;
	@Override
	public void run() {
		while(true) {
		System.out.println("馒头在这里" +  (++count));
		try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
 	}
		if(count == 5) {
			break;
		}
  }
 }
}
