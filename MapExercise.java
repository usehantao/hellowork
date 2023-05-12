import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExercise{
	

	public static void main(String[]args) {
		
		Map maps = new HashMap();
		maps.put(1, new Emp("facai",16000,50));
		maps.put(1, new Emp("huahua",17000,60));
		maps.put(1, new Emp("xiaobai",19000,70));
		maps.put(1, new Emp("mantou",18600,90));
		
		//遍历方式：
	
			Set set = maps.keySet();
			
		for(Object kye : KeySet) {
			Emp emp = (Emp)maps.get(kye);
			if(emp.getSal()>18000) {
				System.out.println(emp);
			}
		}
	}
}

class Emp{
	private String name;
	private double sal;
	private int id;
	
	public Emp(String name,double sal,int id) {
		this.name=name;
		this.sal=sal;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}
}