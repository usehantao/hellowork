package ProxyDome;

public interface UserService {
	String login(String loginName , String passWord);
	void selectUsers();
	boolean deleteUsers();
}

