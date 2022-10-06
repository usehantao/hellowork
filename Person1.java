//创建一个Person1的对象
public class Person1{
	//创建三个实例变量属性 名字 智慧 健康
	public int age;
	  public int wisdom;
	  public int fitness;
	  
	  //创建一个构造函数,将实例变量赋值
	  public Person1(int inputAge){
		  this.age = inputAge;
		    this.wisdom = inputAge * 5;
		    this.fitness = 100 - inputAge;
		    
		  
		  
	  }
	  public void setAge(int newAge){
		    this.age = newAge;
}
	  public void setWisdom(int newWisdom){
		    this.wisdom = newWisdom;
		  }
	  public void setFitness(int newFitness){
		    this.fitness = newFitness;
		  }
	  public void hasBirthday(){
		    
		    this.setAge(this.age + 1);
		    this.setWisdom(this.wisdom + 5);
		    this.setFitness(this.fitness - 3);
		  }
	  public static void main(String[] args){
		  //创建一个对象，赋值参数20
		    Person1 emily = new Person1(20);
		    //对象emily调用hasBirthday方法。
		    emily.hasBirthday();
		    System.out.println("New age is: " + emily.age);
		    System.out.println("New wisdom is: " + emily.wisdom);
		    System.out.println("New fitness is: " + emily.fitness);
		  }
		}
