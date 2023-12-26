package ht.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp02 {
	public static void main(String[]args) {
		//验证url地址
		
		
		//String content = "https://www.bilibili.com/video/BV1fh411y7R8/?spm_id_from=333.999.0.0&vd_source=47fa2d6fb04a95e7155e725c1d1048e5";
		String content = "https://www.luffycity.com/play/61185";
		String reg = "^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.]*)?$";
		//注意：当[.]表示匹配就是点本身
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(content);
		
		if(matcher.find()) {
			System.out.print("格式正确");
		}else {
			System.out.print("格式错误");
		}
	}
}
