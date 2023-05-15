import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest01{
	public static void main(String[]args) {
		
			
			Map m = new HashMap();
			m.put("jack",650);
			m.put("Tom",1200);
			m.put("smith",2900	);
			System.out.println(m);
			
			m.put("jack",2600); //将jack的 工资修改2600 因为KEY 存在一样就是 替换
			
			//所有人加100
			Set keySet = m .keySet();
			for(Object o : keySet){
				Object key = null;
			//更新
			m.put(key ,(Integer)m.get(keySet)+100);
			}
			System.out.println(m);
			
			//遍历Entry
			Set entrySet = m.entrySet();	
			Iterator iterator = entrySet.iterator();
			while(iterator.hasNext()){
			Map.Entry next =(Map.Entry) iterator.next();
			Entry entry = null;
			System.out.println(entry.getKey()+ "-" + entry.getValue());
				}
				
			System.out.println("========\"遍历所有的工资\"============");
			Collection values = m.values();
			for(Object value : values){
			System.out.println("工资 +" + values);
				}
			}
		
	}
