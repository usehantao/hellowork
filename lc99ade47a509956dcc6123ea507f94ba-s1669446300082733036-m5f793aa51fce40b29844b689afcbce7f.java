package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo01 {
	public static void main(String[]args) {
		
		ExecutorService pool = new ThreadPoolExecutor(3,5,6,TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
				new ThreadPoolExecutor.AbortPolicy());
				
				//2.�������̳߳�
				Runnable ht =new MyRunnable();
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				
				//��ʼ������ʱ�߳�
				pool.execute(ht);
				//�ر��̳߳أ�������һ�㲻��ʹ�ã�
				//pool.shutdownNow(); //�����رգ���ʱ����û����ɣ���ʧ����
	}

}