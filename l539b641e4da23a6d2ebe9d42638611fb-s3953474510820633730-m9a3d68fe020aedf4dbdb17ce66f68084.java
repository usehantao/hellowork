package com.ht;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OIStreamDome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String directoryPath = "e:\\mytemp";
		
		 File file =new File(directoryPath);
		 if(!file.exists()) {
			 //不存在 创建
			 if(file.mkdirs()) {
				 System.out.println("创建" + directoryPath + "创建成功");
				 
			 }else {
				 System.out.println("创建" + directoryPath + "创建失败");
			 }
		 }
		 
		 
		 
		 String filePath = "e:\\mytemp\\hello.txt"; 
		 file = new File(filePath);
		 if(file.exists()) {
			 //创建文件
			 if(file.createNewFile()) {
				 System.out.println("创建" + filePath + "创建成功");
				 
				BufferedWriter bufferedwriter = new BufferedWriter (new FileWriter(file));
				bufferedwriter.write("Hello World!");
				bufferedwriter.close();
			 }else {
				 System.out.println("创建" + filePath + "创建失败成功");
			 }
		 }else {
			 System.out.println( filePath + "已经存在");
		 }
		 
		 
		 
		 

	}

}
