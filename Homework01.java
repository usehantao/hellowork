public class Homework01{
	public static void mian(String[]args){
	
	String name ="jack";
	String pwd ="123456";
	String email ="hantao19910919@163.com";
	
	try {
		userRegister(name,pwd,email);
		System.out.println("注册成功");
	}
	catch(Exception e){
	System.out.println(e.getMessage());
		}
	}
	
	

	public static void userRegister(String name,String pwd,String email){
	//1.核验用户名
		int userlen = name.length( );
		if( userlen>=2 &&  userlen <=4){
		throw new RuntimeException("用户名长度为2或3或4");
	}
	//2.核验密码
	if(!(pwd.length() ==6 &&  isDigital(pwd))){
	throw new RuntimeException("密码长度为6，必须为数字");
	}

	//3.核验邮箱
	int j =email.indexOf('@');
	int i = email.indexOf('.');
	if(!( j> 0 && i>j)){
	throw new RuntimeException("邮箱有问题");
	}
	

}
    public static boolean isDigital(String str ){
	//判断字符串是否全部为数字
	char[ ] chars =str.toCharArray( );
	for(int i =0 ; i<chars.length; i++){
	if(chars[i] <'0' || chars[i]>'9'){
	return false;
			}
		}
	return true;
	}
}