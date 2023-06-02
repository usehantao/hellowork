import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo01{
	public static void main(String[]args) throws Exception {
		System.out.println("======服务端启动=====");
		//1.创建 服务端对象注册端口
		DatagramSocket socket = new DatagramSocket(8866);
		
		//2.创建数据包对象 接收数据
		byte[] buffer = new byte[1024 * 64];
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		
		//3.接收数据即可
		socket.receive(packet);
		
		//4.取出数据
		int len = packet.getLength();
		String rs = new String(buffer , 0 ,len);
		System.out.println("收到了" + rs);
		socket.close();
	}
}