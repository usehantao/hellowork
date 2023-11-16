package com.jiheDome;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HomeWork03Clien {
	
	public static void main(String[]args) throws Exception, IOException {
		
		
		//1.接收用户输入，指定下载文件名
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入下载文件名");
		String downlodaFileName = sc.next();
		
		//2.连接客户端，准备发送
	   Socket socket = new Socket(InetAddress.getLocalHost(),9999);
	   //3.获取和socket关联的输出流
	   OutputStream out = socket.getOutputStream();
	   out.write(downlodaFileName.getBytes());
	   //3.设置写入结束标志
	   socket.shutdownOutput();
	   //4.读取服务端返回的文件（字节数据）
	   BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
	   byte[] bytes = StreamUtils.streamToByteArray(bis);
	   //5.得到一个输出流准备将byte写入到磁盘
	   String filePath = "/Users/apple/Desktop/"+downlodaFileName +".png";
	   BufferedOutputStream bow = new BufferedOutputStream(new FileOutputStream(filePath));
	  bow.write(bytes);
	  
	  //关闭相关资源
	  socket.close();
	  bis.close();
	  bow.close();
	  out.close();
	  System.out.println("客户端下载完毕");
		
	}

}
