public class Homework04{
	
	public static void main(String[]args){
		String str ="sdaijsjdiasd3221a6156dassdaADASDASD";
		counStr(str);
		}
		
		/*遍历字符串，如果char在“0-9”就是一个数字
		如果char 在“a-z”就是一个小写的字母
		如果char 在“A-Z”就是一个大写的字母	
		*/
		public static void counStr(String str){
		if(str == null){
		System.out.println("str 不能为空");
		return;
		}
		int strLen = str.length();
		int numCount =0;
		int lowerCount =0;
		int uperCount =0;
		int otherCount =0;
		for(int i =0 ;i<strLen;i++){
		if(str.charAt(i)>='0' && str.charAt(i)<='9'){
		numCount ++;
		}else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
		lowerCount++;
		}else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
		uperCount++;
		}else{
		otherCount++;
				}
			}
		System.out.println("数字有" +numCount );	
		System.out.println("大写字符有" +uperCount);
		System.out.println("小写字符有" +lowerCount);	
		}
	}
