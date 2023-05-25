package com.ht;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class OutputStreamWriteDemo {
	public static void main(String[]args) throws Exception {
		
			//1.定义一个字节输出流
			OutputStream os = new FileOutputStream("E:\\ht.txt");
			//2.把原始的字节输出流转换成字符输出
			//Writer oos =new OutputStreamWriter(os); //默认为UTF-8
			Writer osw = new OutputStreamWriter(os , "GBK");

			BufferedWriter bw = new BufferedWriter (osw);

			
			bw.write("花花xxxx");
			bw.write("发财xx");
			bw.write("馒头xxx");
			
			bw.close();
		
	}
}
