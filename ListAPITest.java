import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListAPITest{
	 public static void main(String[]args) {
		  Car car1  = new Car("宝马",159999);
		  Car car2  = new Car("奔驰",199999);
		  Car car3  = new Car("奥迪",189999);
		
		 List<Car> cars = new ArrayList<>();
			cars.add(car1);
			cars.add(car2);
			cars.add(car3);
			System.out.println( cars);
			cars.remove(car1);
			cars.contains(car2);
			//集合是否为空
			System.out.println( cars.isEmpty());
			//添加多个元素
			cars.addAll(cars);
			System.out.println( cars);
			//查找多个元素
			cars.containsAll(cars);
			
			for(Object o : cars){
			System.out.println(o);
			}
			
			System.out.println("====迭代器遍历======");
			Iterator iterator = cars.iterator();	
			while(iterator.hasNext()){
			Object next = iterator.next();
			System.out.println(next);
			}
			
			}
		

	 }
class Car{
	private String name;
	private double price;

public Car(String name,double price){
	this.name=name;
	this.price =price;
	
}

@Override
public String toString() {
	return "Car [name=" + name + ", price=" + price + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
}