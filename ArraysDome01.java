import java.util.Arrays;
import java.util.Comparator;

public class ArraysDome01{
		public static void main(String[]args) {
			
			Book[] books = new Book[4];
			books[0] = new Book("红楼梦" , 100);
			books[1] = new Book("西游记" , 90);
			books[2] = new Book("水浒传" , 5);
			books[3] = new Book("三国演义" , 20);
			
			//1.price从大到小排序
			Arrays.sort(books,new Comparator<Book>() {
				//这里如果是对Book数组排序，O1和O2就是book对象
				@Override
				public int compare(Book o1,Book o2) {
					double priceVal =  o2.getPrice() - o1.getPrice() ;
					//进行一个转换
					if(priceVal >0) {
						return -1;
					}else if(priceVal < 0) {
						return 1;
					}else {
						return 0 ;
					}
				}
			});
			System.out.println(Arrays.toString(books));
			
			
			
		}
}

class Book{
	private String name;
	private double price;
	
	public Book(String name , double price){
		
	this.name=name;
	this.price = price;
	
	
	
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

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
}