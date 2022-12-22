import java.util.Scanner;

public class dowhlile{
	 
	
	public static void main(String[]args) {
		Scanner myScanner = new Scanner(System.in);
		int passMun = 0;
		double sum = 0;
    for(int i =1 ; i<= 3 ;i ++) {
       System.out.println("请输入第" + i +  "个班的学生成绩");
	   
       double count = 0;
    for(int j = 1; j<=5 ; j++) {
	    System.out.println("请输入第" + j+  "个学生的成绩");
	     double score = myScanner.nextDouble();
	     count += score;
	     if(score> 60) {
	    	 passMun++;
	     }
	     
   }
    System.out.println("成绩为"+ count);
    System.out.println("平均分"+ (count / 5));
    sum += count;
}
    System.out.println("三个班级总分为" + sum + "平均分" +  (sum / 15));
    System.out.println("及格人数为"+ passMun);
	}
     
}