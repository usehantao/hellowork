package ht.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
	public static void main(String[]args) {
		
		String content = "我....我要....学学学学....编程java!";
		
		//String regStr = ""
		
		Pattern pattern = Pattern.compile("\\.");
		Matcher matcher = pattern.matcher(content);
		String NewContent = matcher.replaceAll("");
		//去掉重复的字
		
		System.out.println(NewContent);
		
		pattern = Pattern.compile("(.)\\1+");
		matcher = pattern.matcher(NewContent);
		while(matcher.find()) {
			System.out.println("找到:" + matcher.group(0));
		}
		NewContent = matcher.replaceAll("$1");
		System.out.println(NewContent);
		
	}
}
