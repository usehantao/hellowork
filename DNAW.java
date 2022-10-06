//DNA测试
//创造一个DNA类
public class DNAW{
	//创造一个主方法
	public static void main(String[]args) {
		//创建三个局部变量
		 String dna1 ="ATGCGATACGCTTGA";
	     String dna2="ATGCGATACGTGA";
	     String dna3="ATTAATATGTACTGA";
	     String dna =dna1;
	     //计算变量dna的长度
	     int length =dna.length();
	     System.out.println("Lenghth " + length);
	     //返回“ATG”的索引位置
	     int start =dna.indexOf("ATG");
	      System.out.println("Start: "+start);
	      //返回“TGA”的索引位置
	      int end =dna.indexOf("TGA");
	      System.out.println("End: "+ end);
	      //创建一个if语句 满足含有蛋白质的的三个要求
	      //要以“ATG”开始 所以起始索引不能等于1 
	     
	      if(start !=1 && end != -1 &&(end-start)%3==0){
	          String protein =dna.substring(start,end+3);
	          System.out.println("Protein: " + protein);
	          System.out.println("Condition 1 and 2 are satisfied.");
	          
	        }else{
	          System.out.println("No protein.");
	        }
	        
	        


	    }
	  
	}
