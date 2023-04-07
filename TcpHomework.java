import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpHomework{
		public static void main(String[]args) throws IOException {
			//1.连接服务器端（ip,端口）	
			//连接本机9999端口，如果连接成功，返回Socket对象
			Socket socket = new Socket(InetAddress.getLocalHost(),9999);
			//2.连接上后，生成socket 通过socket.getOutputStream 
			//得到和socket对象关联的输出对象
			OutputStream outputStream = socket.getOutputStream();
			//通过输出流，写入数据到数据通道，使用字符流
			BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(outputStream));
			//从键盘读取用户输入
			Scanner sc = new Scanner(System.in);
			System.out.println("输入你的问题");
			String question =sc.next();
			bufferedWriter.write(question);
			bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，要求对方使用readLine();
			bufferedWriter.flush();//如果使用字符流，需要手动刷新，否则数据不会写入数据通道
			
			//获取和socket关联的输入流，读取数据（字符）并显示
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(inputStream));
			String s = bufferedReader.readLine();
			System.out.println(s);
			
			//关闭流 释放空间
			bufferedReader.close();
			bufferedWriter.close();
			socket.close();
			System.out.println("退出客户端..");
						 
			
		}
	
}