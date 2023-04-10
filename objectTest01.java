import java.util.Scanner;

public class objectTest01{
	public static  void main(String[ ]args){
		//1.定义商品对象
		//2.定义购物车对象
		Goods[ ] shopCar = new Goods[100]; //商品类型的数组，长度是100，装的是地址。
		//3.搭建操作构架
		while(true){
		System.out.println("请您选择如下命令操作");
		System.out.println("请添加商品到购物车 add");
		System.out.println("查询商品到购物车 query");	
		System.out.println("修改商品的数量 update");
		System.out.println("结算购买商品金额 pay");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的命令");
		String command = sc.next();
		switch(command ){
		case "add" :
		add(shopCar,sc);
		break;

		case "query" :
			query(shopCar);
		break;

		case "update" :
		update(shopCar,sc);
		break;

		case "pay" :
		pay(shopCar);
		break;
		default:	
		System.out.println("没有该功能。");
			}
		}
	}
		public static void add(Goods[ ] shopCar ,Scanner sc){
			System.out.println("请输入商品购买编号");
		int ID = sc.nextInt( );
		System.out.println("请输入商品购买名称");
		String name =sc.next( );
		System.out.println("请输入商品购买数量");
		int buynum =sc.nextInt( );
		System.out.println("请输入商品购买价格");
		double pirce = sc.nextDouble ( );
		Goods g =new Goods( );
		g.id = ID;
		g.name =name;
		g.buynum =buynum;
		
		g.price = pirce;
		for(int i =0 ;i<shopCar.length ;i++){
			if(shopCar[ i]==null){
		shopCar [ i ] =g;
		break;
			}
		}
		System.out.println("商品添加成功");
			}
		

		public static void query(Goods[ ] shopCar){
		System.out.println("===========查询购物车信息如下===========");
		System.out.println("编号\t\t\t名称\t\t\t价格\t\t\t购买数量");
		for(int i = 0;i<shopCar.length;i++){
		 Goods g =shopCar[i];
		if(g!=null){
		System.out.println(g.id+"\t\t\t"+g.name+"\t\t\t"+g.price+"\t\t\t"+g.buynum);	
		}else{
		break;
			}
		}
	}
		public static void update(Goods[ ] shopCar,Scanner sc){
		while(true){
			System.out.println("===========请输入商品的ID===========");
		int ID= sc.nextInt( );
		Goods g = getGoodsbyId(shopCar,ID);	
		if(g ==null){
		System.out.println("没有购买该商品");
			}else{
		System.out.println("请你输入：" +g.name +"商品最新购买数量" );
		int buynum = sc.nextInt( );
		g.buynum = buynum;
		System.out.println("修改完成" );
		query(shopCar);
		break;
		}
		}
		}
		

		public static Goods getGoodsbyId(Goods[ ] shopCar,int id){
		for(int i =0 ;i <shopCar.length;i++){
		Goods g = shopCar[i];
		if(g!=null){
		if(g.id==id){
		return g;	}
		}else{
		return null;
		}
		}
		return null;		
		}
		
		public static void pay(Goods[ ] shopCar){
			query(shopCar);
		double money =0;
		for(int i =0 ;i<shopCar.length ;i++){
		Goods g = shopCar[i];
		if(g != null){
		money += (g.price *g.buynum);
			}else{
		break;
		}
		}
		System.out.println("订单中金额为：" + money );
		
		}
}





