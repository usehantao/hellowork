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
				
				//2.给任务线程池
				Runnable ht =new MyRunnable();
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				pool.execute(ht);
				
				//开始创建临时线程
				pool.execute(ht);
				//关闭线程池（开发中一般不会使用）
				//pool.shutdownNow(); //立即关闭，及时任务没有完成，丢失任务、
	}

}