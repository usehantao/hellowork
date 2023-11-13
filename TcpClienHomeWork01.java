package com.jiheDome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClienHomeWork01 {
	public static void main(String[]args) throws Exception, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost() , 9999);
		
		OutputStream out = socket.getOutputStream();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
		
		//从键盘读取用户的问题
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的问题");
		String question = sc.next();
		bw.write(question);
		bw.newLine();
		bw.flush();
		
		InputStream in1= socket.getInputStream();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
		String s = br1.readLine();
		System.out.println(s);
		
		
		
		//关闭流
		socket.close();
		bw.close();
		br1.close();
		
		
		
		
		
		
		
	}
}
