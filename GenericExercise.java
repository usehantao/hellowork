import java.util.ArrayList;
import java.util.Comparator;
public class GenericExercise{
	
	public static void main(String[]args) {
		
		ArrayList<Employee01> employees =new ArrayList<>();
		
		employees.add(new Employee01("xiaobai" , 20000 ,new MyDate (1991 , 11 ,20)));
		employees.add(new Employee01("huahua" , 10000 ,new MyDate (1992 , 12 ,19)));
		employees.add(new Employee01("mantou" , 30000 ,new MyDate (1993 , 10 ,21)));
		employees.add(new Employee01("facai" , 40000 ,new MyDate (1994 , 9 ,22)));
		
		System.out.println("Employees=" + employees);
		
		System.out.println("=======对员工进行排序======");
		employees.sort(new Comparator<Employee01>() {
			//先按照name排序，如果name相同，则按照生日日期先后排序。
			//先对传入的实参进行验证，不能为空，
			public int compare(Employee01 o1 ,Employee01 o2) {
				if(!(o1 instanceof Employee01 && o2 instanceof Employee01 )) {
					System.out.println("类型不对");
					return 0;
				}
				//比较name
				int i = o1.getName().compareTo(o2.getName());
				if(i != 0) {
					return i ;
				}
				
				return o1.getBirthday().compareTo(o2.getBirthday());
				
				
			}
		});
		System.out.println("=======排序后的结果======");
		System.out.println("Employees=" + employees);
		
		
		
	
	}
}