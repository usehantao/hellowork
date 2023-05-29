package ThreadTest;

public class DrawThread extends Thread{
	private Account acc;
	public DrawThread(Account acc,String name){
	super(name);
	this.acc =acc ;
	}
	@Override
	public void run(){
	//È¡Ç®µÄ
	acc.drawMoney(100);
	}
}


