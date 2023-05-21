public class RecursionTest{
	
	public static int totalNumber;
	public static int lastBottle;
	public static int lastCover;
	public static void main(String[]args) {
		
		buy(10);
		System.out.println("总数" +totalNumber);
		System.out.println("剩余盖子数" +lastCover);
		System.out.println("剩余瓶子" +lastBottle);
	}
	public static void buy(int money) {
		int buyNumber = money / 2;
		totalNumber += buyNumber;
		int CoverNumber = lastCover +buyNumber;
		int bottleNumber = lastBottle +buyNumber;
		
		int allmoney =0;
		if(CoverNumber >=4) {
			allmoney = (CoverNumber/4)*2;
		}
		lastCover =CoverNumber % 4;
	
	if(bottleNumber >= 2) {
		allmoney+=(bottleNumber /2) *2;
	}
	lastBottle = bottleNumber %2 ;
	if(allmoney >= 2) {
		buy(allmoney);
	}
	
	}
}