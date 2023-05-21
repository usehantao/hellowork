public class RecursionDome{
	
	//方法递归：直接递归自己调用自己  间接递归：通过其他方法最终调自己
	//递归的方法 无限调用自己，无法终止，出现🚉内存益处。
	/*递归算法的要素大体总结：
		1.递归公式：f(n) = f(n-1)*n
		2.递归的终点:f(1)
		3.递归的方向必须走向终点
		*/
	public static void main(String[]args) {
		System.out.println(f(9));
		System.out.println(f1(5));
		System.out.println(f2(1));
	}
	
	public  static int f(int n) {
		if(n ==1 ) {
			return 1;
		}else {
			return f(n -1)*n;
			
		}
	}
	//计算1-n的和
	public static int f1(int n) {
		if(n ==1) {
			return 1 ;
		}else {
			return f1(n-1)+n;
		}
	}
	public static int f2(int n) {
		if(n==10) {
			return 1;
		}else {
			return 2*f2(n +1 )+2;
		}
	}
}