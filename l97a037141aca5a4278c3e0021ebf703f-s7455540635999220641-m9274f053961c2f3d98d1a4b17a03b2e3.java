package TestDome;

public class UserService {
	public String loginName(String loginName ,String passWord){
		
		if("admin".equals(loginName)&&"123456".equals(passWord)){
	 	return "登录成功";
		}else{
		return "用户名或者登录密码有问题";
			}
		}
	public void selectNames(){
		System.out.println(10/2);
		System.out.println("查询全部用户成功");
		}
	}
	