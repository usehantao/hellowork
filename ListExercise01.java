import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise01{
	public static void main(String[]args){
		List list =new ArrayList();
		for(int i =0 ;i<12;i++){
		list.add("hello"+i);
		}
		System.out.println(list);
		//2号位插入
		list.add(1,"认真学java");
		//获取第五个元素
		System.out.println(list.get(4));
		//删除第6个元素
		list.remove(5);
		System.out.println(list);
		//修改第7个元素
		list.set(6,"超级认真学java");
		System.out.println(list);
		//用迭代器遍历
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
		Object obj = iterator.next();
		System.out.println(obj);
		
				}
			}
		}
