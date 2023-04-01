import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_{
	//演示InetAddress类使用
		public static void main(String[]args) throws UnknownHostException {
			//获取本机的InetAdress对象
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost);
			
			//根据指定的主机名获取InetAddress对象。
			InetAddress Host1 = InetAddress.getByName("apples-Air");
			System.out.println(Host1);
			
			//根据一个域名返回一个InetAddress对象，比如获取wwww.baidu.com
			InetAddress Host2 = InetAddress.getByName("wwww.baidu.com");
			System.out.println(Host2);
			
			//通过InetAddress对象，获取对应的地址
			String hostAddress = Host2.getHostAddress();
			System.out.println("host2对应的地址为  " + hostAddress);//ip地址。
			
			//通过InetAddress对象，获取主机名
			String hostName = Host2.getHostName();
			System.out.println("host2对应的主机名/域名为  " + hostAddress);
			
			
			
			
		}
}