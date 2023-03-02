import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SmallChangSys{

	
	//1.先完成现实菜单，并可以选择菜单，给出对应提示
	//2.完成零钱通明细
	//3.收益入账 完成功能驱动增加新的变量和代码
	//4.消费 定义新的变量 保存消费的原因
	public static void main(String[]args) {
		boolean loop = true ;
		Scanner c = new Scanner(System.in);
		String key = "";
		String details = "---------零钱通明细-----------";
		double monye = 0;
		double balance = 0 ;
		Date date = null ;
		SimpleDateFormat sdf = null ;
		java.text.SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");//获取当前日期
		String  note =  " ";
		// 是java util 下面的类型
	
	do {
			System.out.println("\n============零钱通明细=============");
			System.out.println("\t\t1 零钱通明细");
			System.out.println("\t\t2 收益入账");
			System.out.println("\t\t3 消费️");
			System.out.println("\t\t4 退     出");
			System.out.println("请选择（1-4）");
			key = c.next();
			//使用switch分支控制
			switch(key) {
			case "1":
				System.out.println(details);
				break;
			case "2":
					System.out.println("收益入账金额");
					monye =c .nextDouble();
					if(monye <= 0) {
						System.out.println("收益金额需要大于等于0");
						break;
					}
					balance += monye;
					date  = new Date();
					details += "\n收益入账" + monye + "\t" +sdf1.format(date)+ "\t" + balance;
				break;
			case "3":
				System.out.println("消费金额");
				monye =c.nextDouble();
				System.out.println("消费说明");
				note = c.next();
				balance -= monye;
				date = new Date();
				details += "\n" + note + "\t-" +  monye + "\t" +sdf1.format(date)+ "\t" + balance;
				break;
			case "4":
				String choice = "";
				while(true) {
					System.out.println("你确定要退出吗 y/ n");
					choice = c.next();
					if( "y".equals(choice) || "n".equals(choice)) {
						break;
					}
				}//当用户退出while 再判断这一个输入的是y 还是n 
				if(choice .equals("y")) {
					loop =false ;
				}
				System.out.println("1 退    出");
				loop = false;
				break;
				default:
					System.out.println("选择有误，清重新选择");
			}
					
				
			}while(loop);
			System.out.println("------退出了零钱通项目-------");
	  }
   }
