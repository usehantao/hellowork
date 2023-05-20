import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileDome01{
	public static void main(String[]args) throws IOException {
		
		File f1 = new File("hellowor-HtJavaWeb/src/data.txt");
		//获取绝对路径
		System.out.println(f1.getAbsolutePath());
		//获取文件定义时使用的路径
		System.out.println(f1.getPath());
		//获取文件的名称，带后缀
		System.out.println(f1.getName());
		//获取文件大小，字节个数
		System.out.println(f1.length());
		//获取文件最后的修改时间
		long time = f1.lastModified();
		System.out.println("最后的修改时间为"+ new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
		//判断是文件还是文件夹
		System.out.println(f1.isFile());//true
		System.out.println(f1.isDirectory());//false
		
		//File f2 = new File("hellowor-HtJavaWeb/src/data01.txt");
		//System.out.println(f2.createNewFile());
		
		File f3 = new File("hellowor-HtJavaWeb/src/aaa");
		System.out.println(f3.mkdirs());
	}
}