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
	//��ȡ�߳�����
	String name = Thread.currentThread().getName();
	//2.�ж��˻��Ƿ�
	//ͬ�������
	synchronized(this) {
		if(this.money>= money){
	System.out.println( name +"��ȡǮ�ɹ�" +money);
	//�������
	this.money -= money;
	System.out.println(name+ "ȡǮ��ʣ��" + this.money);
		}else{
	
	System.out.println(name+"����");
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
