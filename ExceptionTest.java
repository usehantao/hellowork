import java.util.Scanner;

public class ExceptionTest{
	public static void main(String[]args) {
		Scanner sc  =new Scanner(System.in);
			while(true){
			try{
			System.out.println("请您输入合法的价格:");
			String pricere = sc.nextLine();
			//转换成double类型价格
			double price = Double.valueOf(pricere);
			//判断价格是否大于0
			if(price > 0){
				System.out.println("价格合理~");
			break;
			}else{
			System.out.println("价格必须是正数~");
					}
				}catch(Exception e){
				e.printStackTrace();
					}
				}
			}
	}
