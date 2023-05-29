package ThreadTest;

public class Account {
	private String cardID;
	private double money;
	
	public Account() {
		
	}
	
	public Account(String cardID ,double monye) {
		this.cardID=cardID;
		this.money = money;
	}

	public void drawMoney(double money){
	//获取线程名字
	String name = Thread.currentThread().getName();
	//2.判断账户是否够
	//同步代码块
	synchronized(this) {
		if(this.money>= money){
	System.out.println( name +"来取钱成功" +money);
	//更新余额
	this.money -= money;
	System.out.println(name+ "取钱后剩余" + this.money);
		}else{
	
	System.out.println(name+"余额不足");
			}
		}
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
