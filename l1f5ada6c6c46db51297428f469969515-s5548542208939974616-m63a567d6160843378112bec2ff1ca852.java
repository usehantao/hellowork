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
		return "��¼�����������";
		
	}
		
		@Override
		public void selectUsers(){
		
		System.out.println("��ѯ��100���û�����");
		try{
		Thread.sleep(2000);
		}catch(Exception e){
		e.printStackTrace();
		}
	}

		@Override
		public boolean deleteUsers(){
		
		try{
		System.out.println("ɾ����100���û�����");
		Thread.sleep(500);
		return true;
		}catch(Exception e){
		e.printStackTrace();
		return false;
			}
		}
}
