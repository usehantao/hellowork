package ThreadTest;

public class ThreadDemo05 {
	public static void main(String[]args) {
		//1.����һ�����߳��࣬����һ�������˻�
		Account acc =new Account("ICBC" ,  100);
		//2.����2���̶߳���
		new DrawThread(acc,"����").start();
		new DrawThread(acc,"��ͷ").start();
		}
	}

