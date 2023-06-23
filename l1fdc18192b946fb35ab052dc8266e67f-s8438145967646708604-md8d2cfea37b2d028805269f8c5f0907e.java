package IODome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDome01 {
	public static  void main(String[]args) throws IOException {
		//完成王稳健拷贝。
		//1.创建文件输入流，将文件读入到程序
		//2.创建文件输出流，将读取到的文件数据写入到指定位置
		String filepath = "e:\\beijita.jpg";
		String destfilepath ="d:\\beijita01.jpg";
		FileInputStream fi = null;
		FileOutputStream ou = null;
		
		try {
			fi = new FileInputStream(filepath);
			ou = new FileOutputStream(destfilepath);
			//定义一个字节数组 提高效率
			byte[] buf = new byte[1024];
			int readLen = 0;
			while((readLen = fi.read(buf))!=-1){
				//读取到后就写入到文件中,边读边写
				ou.write(buf , 0 ,readLen); //必须使用这个方法。
				
			}
			System.out.println("拷贝完毕");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fi != null) {
				fi.close();
			}
			if(ou != null) {
				ou.close();
			}
					
		}
		
	}
	
}
