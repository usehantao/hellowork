import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericeExercise{
	public static void main(String[]args) {
		
		//使用泛型方式给HashSet 放入3个学生对象
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("huahua" ,18));
		students.add(new Student("facai" ,19));
		students.add(new Student("xiaobai" ,16));
		students.add(new Student("mantou" ,15));
		//遍历
		for(Student student : students){
			System.out.println(students);
		}
		
		//使用泛型给HashMap添加对象
		Map<String ,Student> hm = new HashMap<String ,Student>();
		hm.put("1" ,new Student("huahua" ,18));
		hm.put("2" ,new Student("huanhuan" ,18));
		hm.put("3" ,new Student("binggan" ,18));
		//遍历
		Set<Map.Entry<String ,Student>>entries = hm.entrySet();
		 Iterator<Map.Entry<String,Student>>iterator = entries.iterator();	
		while(iterator.hasNext()){
		Map.Entry<String,Student>next = iterator.next();
		System.out.println(next.getKey() + "-" +next.getValue());
		
		}
		
		}
	}

class Student{
	private String name;
	private int age;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}