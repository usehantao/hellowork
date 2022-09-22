//程序成功 独立完成，了解创造方法，调用方法，创建对象。
public class Calculator{

public Calculator(){

}

public int add(int a, int b){
  
  return a+b;



}
public int subtract(int a, int b){
   
   return a-b;
}

public int multiply(int e ,int f){

 
  return e*f;


}
public int divide(int g ,int h){
   return g/h;

}
public int modulo(int j,int k){
   return j%k;

}
public static void main(String[]args){
  Calculator myCalculator=new Calculator();
System.out.println(myCalculator.add(5,7));
System.out.println(myCalculator.subtract(45,11));
System.out.println(myCalculator.multiply(5,7));




}
}