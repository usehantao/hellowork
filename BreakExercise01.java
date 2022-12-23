import java.util.Scanner;

public class BreakExercise01{
	
	public static void main(String[]args) {
		
		//实现登陆验证 有3次机会，如果用户名为丁真，密码为 666 提示登陆成功
		//否则提示还有几次机会
		//1.创建Scanner 对象接受用户输入
		//2.定义一个String name String passwd 保存用户名和密码
		//3.循环3次，如果满足条件就提前退出。
		//定义个变量。int chance
		
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for(int i = 1; i<= 3; i++) {
			System.out.println("请输入你的名字");
			name = myScanner.next();
			System.out.println("请输入你的密码");
			passwd = myScanner.next();
			//z字符串的内容是否相等使用equals;
			if("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("登陆成功");
				break;
				
			}
			//登陆的机会就会减少一次。
			chance-- ;
			System.out.println("你还有" + chance + "机会");
		}
	}
}