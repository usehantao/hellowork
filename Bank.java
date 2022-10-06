//创建一个银行的类。
public class Bank{
	//私有化两个变量accountOne和accountTwo
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
//创建一个构造函数，初始化accountOne 及accountTwo的值
  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }
//创建一个主方法
  public static void main(String[] args){
	  //创建一个名为bankofGods的对象
    Bank bankOfGods = new Bank();
    //bankofGods调用accountOne的getBalance方法，因为构造函数Bank赋值初始化属性为100，故打印输出为100.
    System.out.println(bankOfGods.accountOne.getBalance());
    //bankofGods调用accountOne的setBalance方法，修改private的值为5000，打印输出为5000.
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    //调用getMonthlyInterest方法，为0.02*设置之后的值为5000 故打印输出为100.0
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());

  }

}