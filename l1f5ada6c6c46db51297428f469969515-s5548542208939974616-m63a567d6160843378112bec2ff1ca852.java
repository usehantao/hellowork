package ProxyDome;

public class UserServiceImpl implements UserService {
	@Override
	public String login(String loginName , String passWord){
		try{
		Thread.sleep(1000);
		}catch(Exception e){
		e.printStackTrace();
		}
		if("facai".equals(loginName)&& "1234".equals(passWord)){
			
		return "success";
		}
		return "登录名或者密码错";
		
	}
		
		@Override
		public void selectUsers(){
		
		System.out.println("查询了100个用户数据");
		try{
		Thread.sleep(2000);
		}catch(Exception e){
		e.printStackTrace();
		}
	}

		@Override
		public boolean deleteUsers(){
		
		try{
		System.out.println("删除了100个用户数据");
		Thread.sleep(500);
		return true;
		}catch(Exception e){
		e.printStackTrace();
		return false;
			}
		}
}
