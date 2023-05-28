package com.ht;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo01 {
	public static void main(String[]args) throws Exception {
		//PrintStream ps =new PrintStream(new FileOutputStream("e:\\ht.txt"));
		PrintStream ps1 =new PrintStream("E:\\ht.txt");
		PrintWriter ps2 =new PrintWriter(new FileOutputStream("e:\\ht.txt" ,true));
		
		ps1.print(true);
		ps1.print(97);
		ps1.print("·¢²ÆÄØ");
		
		ps1.close();
	}
}
