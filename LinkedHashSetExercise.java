import java.util.LinkedHashSet;

public class LinkedHashSetExercise{
	public static void mian(String[]args){
		
		LinkedHashSet lhs =new LinkedHashSet();
		lhs.add(new Car("奥迪",1000));
		lhs.add(new Car("宝马",2000));
		lhs.add(new Car("法拉利",11000));
		lhs.add(new Car("奥迪",2000));
		lhs.add(new Car("奔驰",15000));
		lhs.add(new Car("奥迪",5000));

		System.out.println(lhs);
	}
	}

	class Car{
		private String name;
		private double price;

		public Car(String name , double price){
		this.name =name;
		this.price =price;
		}
	//重写equals和hashCode方法
	//当name和price相同时，就返回相同的hashCode值，equals值返回true

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


