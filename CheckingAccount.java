//创建一个账户的类 并私有化名字，余额，id 利率四个属性。
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;
//创建一个构造函数，初始化实例变量四个属性的值
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }
//获取private的方法。
  public int getBalance(){
    return this.balance;
  }
  //修改private的实例变量blance的值。
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }

}