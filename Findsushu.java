public class Findsushu{
		public static void main(String[]args) {
			for(int i =101 ; i<=200 ;i++) {
				
				//信号位：标记。
				boolean flag = true;
				
				for(int j =2 ;j< i/2 ; j++) {
					if(i % j ==0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.print(i+"\t");
				}
			}
		}
		
		 
}