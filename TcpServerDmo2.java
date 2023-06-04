import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//实现服务端同时处理多个客户端消息

public class TcpServerDmo2{
	public static void main(String[]args) {
		try {
			System.out.println("=====服务端成功启动======");
			//1.注册端口
			ServerSocket Serversocket = new ServerSocket(6666);
			//定一个死循环，由主线程不断接收客户端的Socket连接
			while(true) {
			//开始独立创建线程处理sokcet
			Socket socket = Serversocket.accept();
			System.out.println(socket.getRemoteSocketAddress() + "上线了");
			
			new  ServerReaderThread(socket).start();
			
					}
				
		}catch(Exception e) {
			e.printStackTrace();
			
			}
	}
}