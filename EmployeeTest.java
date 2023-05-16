public class EmployeeTest{
	private  String name;
	private double sal;
	private Mydate birthday;
	
	public  EmployeeTest(String name, double sal ,Mydate birthday) {
		this.name =name;
		this.sal = sal;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "\nEmployeeTest [name=" + name + ", sal=" + sal + ", birthday=" + birthday + "]";
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
	public Mydate getBirthday() {
		return birthday;
	}
	public void setBirthday(Mydate birthday) {
		this.birthday = birthday;
	}
	
}