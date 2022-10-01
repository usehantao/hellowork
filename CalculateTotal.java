
//这是一个列表运行所需要的包 
import java.util.ArrayList;

//创建一个计算机总计的类
class CalculateTotal{
//主方法入口
public static void main(String[]args) {
	//创建一个名字为expenses 数据类型为Double的空列表
	ArrayList <Double> expenses=new ArrayList<Double>();
	//添加值给该列表
	expenses.add(88.2);
	expenses.add(18.8);
	expenses.add(2.8);
	expenses.add(12.8);
	//创建一个double类型的 名为total的变量 初始化为0
	double total =0;
	/*创建一个for循环 在for循环内部设置int 数据名为i的变量初始化为0 
	 * i小于expense的列表长度，i递增。
	 * 方法体：expenses.get索引列表expenses的值 赋值运算+= 表示total=total+expenses.get(i);
	 */
	for(int i =0; i<expenses.size(); i++) {
		
		total += expenses.get(i);
		
		
		
	}
	System.out.println(total);
	
}

	
}

