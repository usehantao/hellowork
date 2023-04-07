import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpHomeworkServer{
		public static void main(String[]args) throws IOException {
			//1.本机在 9999端口监听，等待连接
			ServerSocket serverSocket =new ServerSocket(9999);
			System.out.println("服务端，在9999端口监听，等待连接。。。");
			//当没有客户端连接9999端口时，程序会阻塞，等待连接
			//如果客户端连接，则会返回Socket对象，程序继续
			Socket socket = serverSocket.accept();
			System.out.println("服务端 socket = " + socket.getClass());
			
			//通过socket.getInputStream()读取客户端写入到数据通的数据，显示
			InputStream inputStream = socket.getInputStream();
			//IO读取，使用字符流 使用InputStreamReader 将 InputStream 转成字符流
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String s = bufferedReader.readLine();
			String answer = "";
			if("name".equals(s)) {
				answer ="我是发财";
				
			}else if("hobby".equals(s)){
				answer ="学习";
			}else {
				answer ="你在说啥";
			}
			
			
			//获取socket相关输出流
			OutputStream outputStream = socket.getOutputStream();		
			//使用字符输入流的方式回复信息
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
			bufferedWriter.write(answer);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			//关闭流 释放空间
			bufferedWriter.close();
			socket.close();
			outputStream.close();
			bufferedReader.close();
			
			
		}
}