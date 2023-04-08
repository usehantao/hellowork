import java.util.Scanner;

public class Test05{
		public static void main(String[]args) {
			
			int [] socres = new int[6];
			
			Scanner sc = new Scanner(System.in);
			for(int i =0 ;i<socres.length;i++) {
				System.out.print("请输出第"+(i+1) +"个评委打分");
				int socer = sc.nextInt();
				socres[i] = socer;
				
			}
			
			int max =socres[0];
			int min = socres[0];
			int sum =0 ;
			for(int i = 0 ;i <socres.length;i++) {
				if(socres[i]> max) {
					max = socres[i];
				}
				if(socres[i]<min) {
					min =socres[i];
				}
				//统计总分
				sum += socres[i];
			}
			double result = (sum - max -min )*1.0  / (socres.length -2);
			System.out.println("最高分" + max);
			System.out.println("最低分" + min);
			System.out.println("最终得分 去掉最高分，去掉最低分后的平均分为" + result);
			
	}
}