import java.util.HashSet;

public class HashSetExercise{
	
		public static void main(String[]args){
		HashSet hashset =new HashSet();
		hashset.add(new Employee("facai",25));	
		hashset.add(new Employee("facai",20));
		hashset.add(new Employee("huahua",18));
		hashset.add(new Employee("mantou",19));

		System.out.println(hashset);	
		}
	}
class Employee{
	private String name;
	private int age;
	
public Employee(){
	}
public Employee(String name,int age){
	this.name =name ;
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
	return "Employee [name=" + name + ", age=" + age + "]";
}


@Override
public boolean equals(Object o){
	if(this==o)return true;
	if(o==null || getClass() != o.getClass()) return false;
	Employee employee =(Employee)o;
	try {
		try {
			try {
				try {
					return age == employee .age &&
					Object.equals(name);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
@Override
public int hashCode(){
	return Object.hash(name ,age);
	}
}
