package com.jiheDome;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPSenderA {
	public static void main(String[]args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket(9990);
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入你的问题");
		String question = sc.next();
		
		byte[] data = question.getBytes();
		DatagramPacket packet = new DatagramPacket(data,data.length,InetAddress.getLocalHost(),8888);
		
		socket.send(packet);
		
		//收到b端的消息回复
		byte[] buf = new byte[1024];
		packet =new DatagramPacket(buf , buf.length);
		socket.receive(packet);
		
		int length =packet.getLength();
		data = packet.getData();
		String s = new String(data,0,length);
		System.out.println(s);
		
		//
		socket.close();
		
				
	}
}
