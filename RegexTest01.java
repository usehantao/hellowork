import java.util.Scanner;

public class RegexTest01{
	public static void main(String[]args) {
		//校验手机号吗，邮箱
		//checkPhone();
		checkEmail();
	}
	
	public static void checkEmail() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("请输入你的邮箱");
		String phone = sc.next();
		if(phone.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
			System.out.println("邮箱格式正确");
			break;
		}else {
			System.out.println("邮箱错误");
			}	
		}
		
	}
	
	public static void checkPhone() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("请输入你的手机号");
		String phone = sc.next();
		if(phone.matches("1[3-9]\\d{9}")) {
			System.out.println("手机号码格式正确");
			break;
		}else {
			System.out.println("手机号码错误");
			}	
		}
	}
}