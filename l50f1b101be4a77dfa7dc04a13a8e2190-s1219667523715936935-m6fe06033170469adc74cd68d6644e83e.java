package ThreadTest;

public class DrawThread extends Thread{
	private Account acc;
	public DrawThread(Account acc,String name){
	super(name);
	this.acc =acc ;
	}
	@Override
	public void run(){
	//ȡǮ��
	acc.drawMoney(100);
	}
}


