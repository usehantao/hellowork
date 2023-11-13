package com.jiheDome;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSenderB {
	public static void main(String[]args) throws IOException {
		
		DatagramSocket  socket = new DatagramSocket(8888);
		
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf,buf.length);
		System.out.println("接收端b等待接收数据");
		
		socket.receive(packet);
		int length = packet.getLength();
		byte[] data =packet.getData();
		String s = new String(data ,0,length);
		String answer = "";
		if("四大名著是哪些".equals(s)) {
			answer = "发财，花花， 馒头，发财";
		}else {
			answer = "what";
		}
	// 回复信息
		data = answer.getBytes();
		packet =new DatagramPacket(data ,data.length,InetAddress.getLocalHost(),9990);
		socket.send(packet);
		
		//关闭资源
		socket.close();
		System.out.println("b端退出");
		
		
	}
}
