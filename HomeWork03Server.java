package com.jiheDome;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWork03Server {
	public static void main(String[]args) throws Exception {
		
		//1.在9999端口监听，等待客户端连接
		ServerSocket serversocket = new ServerSocket(9999);
		//2.等待客户端连接
		Socket socket = serversocket.accept();
		//3.读取客户端发送 要下载的文件名
		InputStream in = socket.getInputStream();
		byte[] b = new byte[1024];
		int len =0 ;
		String downLoadFileNmae = "";
		while((len =in.read(b)) != -1) {
			downLoadFileNmae += new String(b,0,len);
			
		}
		System.out.println("接收到客户端希望下载的文件名" +downLoadFileNmae);
		
		String resFileName = "";
		if("金毛".equals(downLoadFileNmae)) {
			resFileName = "/Users/apple/Desktop/发斗.png";
		}else {
			resFileName ="/Users/apple/Desktop/金毛.png";
		}
		//4创建输入流，读取文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
		byte[] bytes = StreamUtils.streamToByteArray(bis);
		//6.得到输出流
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
		//7.写入到数据通道，返回给客户端
		bos.write(bytes);
		socket.shutdownOutput();//很关键
		//关闭相关资源
		bis.close();
		in.close();
		socket.close();
		serversocket.close();
		System.out.println("服务端退出");
		}

}
