package ht.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp01 {
	public static void main(String[]args) {
		
		//String content = "发财馒头花花小白";
		//验证汉字
		//String reg = "^[\u0391-\uffe5]+$";
		
		//验证 是1-9开头的一个六位数
		//String content = "310015";
		//String reg = "^[1-9]\\d{5}$";
		
		//验证1-9开头 5-10位数字
		//String content = "925123621";
		//String reg ="^[1-9]\\d{4,9}$";
		
		//手机 必须以13，14，15，18开头 11位数字
		String content = "18858282021";
		String reg ="^1[3|4|5|8]\\d{9}$";
		
		Pattern pattern = Pattern.compile(reg);
		
		Matcher matcher = pattern.matcher(content);
		
		if(matcher.find()) {
			System.out.println("满足格式");
		}else {
			System.out.println("不满足格式");
		}
	}
}
