package ht.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//反向引用
public class RegExp03 {
	public static void main(String[]args) {
		
		String content = "hello33333 jack1567 t1551om11 j12345-333999111ack22 yyy xxx";
		//String regStr = "(\\d)\\1"; //找到连续两个相同的数字
		//String regStr = "(\\d)\\1{4}"; //找到连续5个相同的数字
		//String regStr = "(\\d)(\\d)\\2\\1";
		String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
		
		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(content);
		while(matcher.find()) {
			System.out.println("找到:  " + matcher.group(0));
		}
	}
}
