public class Employee01{
	
	private String name;
	private double sal;
	private MyDate birthday;
	
	public Employee01(String name ,double sal ,MyDate birthday) {
		this.name = name;
		this.sal =sal ;
		this.birthday = birthday;
		
		
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

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "\n Employee01 [name=" + name + ", sal=" + sal + ", birthday=" + birthday + "]";
	}
	
	
	
}