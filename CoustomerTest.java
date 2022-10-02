/*
 * 关于java语言当中的this关键字
 * 1.this是一个关键字，翻译为：这个
 * 2.this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身，this存储再JVM堆内存java对象内部
 * 3.创建100个java对象，每个对象都有this，也就是有100个this
 * 4.this可以出现在实例方法中，代表当前正在执行这个动作的对象。（this代表当前对象。）
 * 5.this在多数情况下是可以省略不写的。
 * 6.this不能使用在带有static的方法中。
 * 
 * 
 */
public class CoustomerTest{
	
	//姓名 堆内存的对象内部中储存，所以必须先创建对象通过引用方法访问。
	String name; //实例变量：必须采用 引用 的方式访问
	
	//构造方法
	public CoustomerTest() {
		
		
	}
	//不带static关键字的一个方法
	//顾客购物的最终结果是不一样的
	//所以购物这个行为是属于对象级别的行为
	//由于每个对象再执行购物这个动作的时候最终结果不同，所以购物这个动作必须有对象的参与
	//重点：没有static关键字的方法被称为“实例方法” 实例方法访问方法："引用."
	//重点：没有static关键字的变量称为“实例变量”
	//注意：当一个行为/动作执行的过程中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不要带static关键字。
	//以下方法定位为实例方法
	public void shopping() {
		System.out.println(this.name+"购物!");
		
		
	}
	public static void run() {
		CoustomerTest b =new CoustomerTest();
		
		
		System.out.println(b.name);
		
		
		
	}
}