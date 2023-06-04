import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo03{
	public static void main(String[]args) {
		try {
		System.out.println("=====客户端启动======");
		
		Socket socket = new Socket("172.16.211.197", 6666);
			
			
		OutputStream os = socket.getOutputStream();
		
		PrintStream  ps  = new PrintStream(os);
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请说：");
			
			String msg = sc.nextLine();
			ps.println(msg);
			ps.flush();
		}
		
			
	}catch(Exception e) {
		
		}
	}
}