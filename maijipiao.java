import java.util.Scanner;

public class maijipiao{
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("机票原价");
			double pric = sc.nextDouble();
			System.out.println("月份");
			int month = sc .nextInt();
			System.out.println("选择舱位");
			String type = sc.next();
			
			double re  = calc(pric ,month,type);
			System.out.println("你当前购买机票的价格为" + re);
		}
		
		public static double calc(double money ,int month , String type) {
				if(month >= 5 && month <=10) {
					
					switch(type) {
					case "经济舱" :
						money *=0.85;
						break;
					case"头等舱":
						money *=0.9;
						break;
						default:
							System.out.println("您输入的舱位不正确");
							money = -1;
					}
				}else if(month ==11 || month==12|| month >=1 && month<=4) {
					switch(type) {
					case "经济舱" :
						money *=0.65;
						break;
					case"头等舱":
						money *=0.7;
						break;
						default:
							System.out.println("您输入的舱位不正确");
							money = -1;
					}
				}else {
					System.out.println("您输入的月份不正确");
					money = -1;
				
				}
				return money;
		}
}