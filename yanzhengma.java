import java.util.Random;

public class yanzhengma{
		public static void main(String[]args) {
			String code = yanzhengma(5);
			System.out.println("随机验证码为 "+ code);
		}
		public static String yanzhengma(int n) {
			String code = " ";
			//定义一个for循环，循环n次，依次生成随机数。
			Random r = new Random();
			for(int i = 0; i<n ;i++) {
				//生成一个随机字符，英文大写，小写，数字。
				int type =r.nextInt(3); // 0 1 2
				switch(type) {
				case 0:
					//大写字符（A 65 -Z65+25)
					char  ch = (char)(r.nextInt(26)+65);
					code += ch;
					break;
				case 1:
					//小写字符
					char  ch1 = (char)(r.nextInt(26)+97);
					code += ch1;
					
					break;
				case 2:
					//随机数字
					code += r.nextInt(10);
					break;
				}
				
				
			}
			return code;
		}
}