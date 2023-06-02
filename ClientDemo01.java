import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClientDemo01{
	public static void main(String[]args) throws Exception {
		System.out.println("======客户端启动=====");
		//1.创建发送端对象 ,发送端自带默认端口号
		DatagramSocket socket = new DatagramSocket();
		
		//2.创一个数据包对象 封装数据
		byte [] buffer = "你在哪里，在干嘛？".getBytes();
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length,InetAddress.getLocalHost(), 8866);
		
		//3.发送数据出去
		socket.send(packet);
		socket.close();
	}
}