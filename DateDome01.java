import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDome01{
		public static void main(String[]args) throws ParseException {
			
			//这里的Date 类是在java.util包
			//默认输出的日期格式是国外的方式，因此需进行格式化
			Date  d1 = new Date();//获取当前系统时间
			System.out.println("当前日期时间是" + d1);
			
			//通过毫秒数得到时间
			Date d2 = new Date(9234567);
			System.out.println("d2 =" + d2);//获取某个时间对应的毫秒数
			
			
			//创建SimpleDateFormat对象 ，可以指定相应的格式
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
			String format = sdf.format(d1);
			System.out.println("当前日期时间是" + format);
			
			//可以把一个格式化的字符串转成对应的Date
			String s ="1991年9月19日 19:19:19 星期日";
			Date parse =sdf.parse(s);
			System.out.println("parse +=" + parse);
			System.out.println("parse +=" + sdf.format(parse));
			
			
			
			
		}
} 