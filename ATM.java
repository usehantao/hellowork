public class ATM{
	//创建两个静态变量，静态变量无需创建对象访问，可以直接使用类名.的方式访问，在同一个类中，类名可以省略。
    public static int totalMoney =0;
	public static int numATMs =0 ;
	//创建一个实例变量，也称为成员变量。
	public int money;
	
	//创建一个构造函数，作用：创建对象，并初始化实例变量。
	public ATM(int inputMoney) {
		this.money=inputMoney;
		//numATMs =numATMs+1
		numATMs+=1;
		//totalMoney =totalMoney+inputMoney
		totalMoney+=inputMoney;
		
	}
	//创建一个实例方法。
	public void withdrawMoney(int amountToWithdraw) {
		if(amountToWithdraw <=this.money) {
			this.money -=amountToWithdraw ;
			totalMoney-=amountToWithdraw ;
		}
		
	}
	//创建一个静态方法，类名.的方式访问
	public static void averageMoney(){
	    System.out.println(totalMoney / numATMs);
	  }
	//主方法入口
	public static void main(String[] args){
       /*程序先执行输出"Total number of ATMs: "+调用静态变量numATMs
        * 创建对象 firstATM 及secondATM并赋值1000 及500
        * 程序输出"Total number of ATMs: "+调用静态变量numATMs
        * 程序输出打印"Total amount of money in all ATMs: "调用静态变量totalMoney
        * firstATM对象调用withdrawMoney方法
        * secondATM对象调用withdrawMoney方法
        * 程序打印输出"Total amount of money in all ATMs: " + ATM.调用静态变量
        * ATM.averageMoney();调用静态方法averageMoney
        */
	    System.out.println("Total number of ATMs: " + ATM.numATMs); 
	    ATM firstATM = new ATM(1000);
	    ATM secondATM = new ATM(500);
	    System.out.println("Total number of ATMs: " + ATM.numATMs); 

	    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
	    firstATM.withdrawMoney(500);
	    secondATM.withdrawMoney(200);
	    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    

	    
	    ATM.averageMoney();
	  }

	}
