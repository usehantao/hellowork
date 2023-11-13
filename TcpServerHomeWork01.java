package com.jiheDome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerHomeWork01 {
	public static void main(String[]args) throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(9999);
		
		System.out.println("服务端,在9999端口监听 ");
		
		Socket socket =serverSocket.accept();
		
		InputStream in =  socket.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String s = br.readLine();
		System.out.println(s);
		String naswer  = "";
		if("name".equals(s)) {
			naswer = "我是你大爷";
			
		}else if("hobby".equals(s)) {
			naswer = "舔 bbb";
					
		}else {
			naswer = "6炮 或撒花头拉";
		}
		
		OutputStream ot = socket.getOutputStream();
		BufferedWriter br1 = new BufferedWriter(new OutputStreamWriter(ot));
		br1.write(naswer);
		br1.newLine();
		br1.flush();
		System.out.println("服务端退出");
		
		//关闭流
		serverSocket.close();
		br.close();
		br1.close();
		in.close();
		
	}
}
