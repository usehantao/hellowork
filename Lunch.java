import java.util.ArrayList;

//创建一个lunch类
class Lunch{
	/*创建一个名为removeAnts的 数据列表方法
	 * 该方法的类型为ArrayList<String>
	 * 方法名为 removeAnts
	 * 形式参数：类型为ArrayList<String> 名为lunchBox
	 */
	public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
		/*方法体：
		 * for循环方法历遍lunchBox的每个索引
		 * if语句：如果lunchBox的索引值为ant 则删除该项目后 lunchBox长度减一
		 * 索引内容自动向左移动一位
		 * 因为该方法没有void关键字 需return一个值。
		 *
	
		 */
		for (int i = 0; i < lunchBox.size(); i++) {
		      if (lunchBox.get(i) == "ant"){
		        lunchBox.remove(lunchBox.get(i));
		        i--;   
				
			}
			
		}return lunchBox;
		
		
		
	}
//主方法
	public static void main(String[]args) {
		//创建一个lunchContainer的列表对象
		ArrayList<String>lunchContainer = new ArrayList<String>();
		//添加值进列表
		lunchContainer.add("apple");
		lunchContainer.add("ant");
		lunchContainer.add("ant");
		lunchContainer.add("facai");
		lunchContainer.add("xiaorizi");
		//将lunchContainer赋值给removeAnts方法
		lunchContainer=removeAnts(lunchContainer);
		System.out.println(lunchContainer);
		
	}
	
}