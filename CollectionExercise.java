import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise{
	public static void main(String[]args){
		List list =new ArrayList();	
		list.add(new Dog("facai",3));
		list.add(new Dog("huahua",11));
		list.add(new Dog("mantou",2));
		
		//先使用foreach
		for(Object dog : list){
		System.out.println("Dog=" +dog);
		
			}	
		//使用迭代器
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			Object dog = iterator.next();
		System.out.println("Dog=" +dog);
			}
		}
}
class Dog{
	private String name;
	private int age;

	public Dog(String name ,int age){
	this.name =name ;
	this.age=age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
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
}