import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 完成socket网络编程入门案例的客户端开发
 */
public class TcpClientDemo01{
	public static void main(String[]args) throws Exception {
		System.out.println("====客户端启动成功=====");
		//1.创建socket通信管道请求有服务器连接
		//public Socket（String host ,int port);
		//参数一：服务端ip地址
		//参数二：服务器端口
		Socket socket = new Socket("172.16.211.197" ,7777);
		//2.从socket管道通信里得到字节输出流
		OutputStream os =  socket.getOutputStream();
		//3.把低级字节输出流包装成打印流
		PrintStream ps= new PrintStream(os);
		//4.发送消息
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("请说");
		String msg = sc.nextLine();
		ps.println(msg);
		ps.flush();
		}
		//5.关闭资源}
		// socket.close();
	}
}