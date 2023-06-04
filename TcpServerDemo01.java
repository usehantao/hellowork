/*
 * 开发socket网络编程入门代码的服务器 实现接收消息
 * 代表类：ServerSocekt类，注册端口
 * 调用accpet方法阻塞等待接收客户端连接，得到socket对象
 * socket一方关闭或者出现异常，对方socket也会失效或者出错
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo01{
	public static void main(String[]args) throws Exception {
		System.out.println("====服务端启动成功=====");
		ServerSocket ss = new ServerSocket(7777);
		//2.调用accept方法，等待接收客户端的Socket连接请求，建立socket管道
		Socket socket = ss.accept();
		
		//3.从socket通信管道中得到一个字节输入流
		InputStream is = socket.getInputStream();
		//4.包装成高级流bufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//5.按照行读取消息
		String msg;
		while((msg =br.readLine()) != null) {
			System.out.println(socket.getRemoteSocketAddress() + "说了:" + msg);
		}
		
		
	}
	
}