import java.io.File;

public class RecursionDome01{
	public static void main(String[]args) {
		//从某文件搜索出某个文件并输出绝对路径
		searchFile(new File("hellowor-HtJavaWeb"),"Homework04.java");
	}
	
	public static void searchFile(File dir,String FileName){
		//潘队dir是否是目录
		if(dir != null && dir.isDirectory()) {
			//是目录可以寻找
			//提取当前目录下的一级文件对象
			File[] files =dir.listFiles(); 
			//判断是否存在文件夹，存在遍历
			if(files != null && files.length>0) {
				for(File file :files) {
					if(file.isFile()) {
						//核实是否我们需要寻找的文件
						if(file.getName().contains(FileName)) {
							System.out.println("找到了" +file.getAbsolutePath());
						}
					}else {
						//是文件夹，继续递归找
							searchFile(file,FileName);
						
					}
				}
			}
			
		}else {
			System.out.println("你当前搜索的不是文件夹");
		}
		
		}
}