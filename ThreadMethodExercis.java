public class ThreadMethodExercis{
	public static void main(String[]args) throws InterruptedException {
		Thread t3 = new Thread(new T3());//创建子线程。
		
		for(int i = 1; i<=10 ; i++) {
			System.out.println("hi" + i);
			if(i == 5) {
				t3.start(); //当主线程执行5次，启动子线程。
				t3.join(); //让t3先执行。
			}
			Thread.sleep(1000);
		}
		
	}
}

class T3 implements Runnable{
	int count = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println("hello" + (++count));
			
			try{
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