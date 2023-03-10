import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DAO<T>{ //DAO 泛型类。
	
	private Map<String , T>map =new HashMap<>();
	
	public T get(String id) {
		return map.get(id);
	}
	
	public void update(String id ,T entity) {
		map.put(id, entity);
		
	}
	
	public List<T>list(){
		//遍历map 将map的所有的valu（Entity)封装到ArrayList返回即可。
		List<T>list = new ArrayList<>();
		Set<String>keSet = map.keySet();
		String[] keySet = null;
		for(String key : keySet) {
			list.add(get(key));
			
		}
		return list;
	}
	
	public void delete(String id) {
		map.remove(id);
		
	}
	
	public void save(String id ,T entity) {
		map.put(id, entity);
	}
	
}