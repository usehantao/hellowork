import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericeExercise01{
	public static void main(String[]args) {
		
		List<EmployeeTest> lists = new ArrayList<>();
		lists.add(new EmployeeTest("huahua",2000,new Mydate(1991,9,19)));
		lists.add(new EmployeeTest("facai",5000,new Mydate(1995,10,19)));
		lists.add(new EmployeeTest("mantou",6000,new Mydate(1999,11,19)));
		System.out.println(lists);
		
		//调用ArrayList的sort方法 排序
		System.out.println("========对员工进行排序======");
		lists.sort(new Comparator<EmployeeTest>() {
			@Override
			public int compare(EmployeeTest o1 ,EmployeeTest o2) {
				//先对传入参数进行验证
				if(!(o1 instanceof EmployeeTest && o2 instanceof EmployeeTest)) {
					System.out.println("类型不正确");
					return 0;
				}
				int i = o1.getName().compareTo(o2.getName());
				if(i!=0) {
					return i ;
				}
				//如果名字相同继续比较 生日 
				return o1.getBirthday().compareTo(o2.getBirthday());	
				}
		});
		System.out.println("========排序后的结果======");
		System.out.println(lists);
	}
}