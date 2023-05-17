import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dao<T>{
	
	private Map<String,T> maps = new HashMap<>();
	
	public T get(String id) {
		return maps.get(id);
	}
	public void update(String id ,T entity) {
		maps.put(id, entity);
	}
	//遍历map 将map的所有value 封装到Arraylist返回。
	public List<T>list(){
		//创建ArrayList
		List<T> list = new ArrayList<>();
		//遍历map
	 Set<String> keySet = maps.keySet();
	 for(String key : keySet) {
		 list.add(get(key));
	 }
	 return list;
	}
	public void delete(String id) {
		maps.remove(id);
	}
	public void save(String id,T entity) {
		maps.put(id, entity);
	}
}