import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03{
	public static void main(String[]args) {
		//1.使用Map集合存储
		Map<String,List<String>> data = new HashMap<>();
		
		//2.把学生的数据存储进去
		List<String> selects = new ArrayList<>();	
		
		data.put("cai",selects);
		System.out.println(data);
		
		List<String> selects1 = new ArrayList<>();	
		//Collection..addAll(selects1,"C","D");
		data.put("mantou",selects1);
		System.out.println(data);

		List<String> selects2 = new ArrayList<>();	
		//Collection.addAll(selects2,"A","D");
		data.put("huahua",selects2);
		System.out.println(data);

		//统计每个景点选择的人数
		Map<String,Integer> infos =new HashMap<>();	
		
		//4.提取所有人选择景点的信息
		Collection<List<String>> values = data.values();
		System.out.println(values);
		//values={[A,B C,D] ,[C,D]} 用foreach遍历
		for(List<String>value : values){
		// 判断是否含有该值
			for(String s: value){
		if(infos.containsKey(s)){
		infos.put(s,infos.get(s)+1);
		}else{
		infos.put(s,1);
				}
			}
		}
		System.out.println(infos);
		}
	}
