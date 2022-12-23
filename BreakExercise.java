public class BreakExercise{
	
	public static void main(String[]args) {
		
		//1-00以内的数求和，求出当和大于20的当前数
		
		//1.循环 1-100 求和sum
		//2.当sum>20时，记录下当前数，然后berak
		//i的作用范围在for循环内
		int sum = 0;
		for (int i = 1 ; i <= 100; i++) {
			sum+=i;//累计
			if(sum > 20) {
				System.out.println("当和大于20的时候，当前数i=" + i);
				
				break;}
		}
		
	}
}