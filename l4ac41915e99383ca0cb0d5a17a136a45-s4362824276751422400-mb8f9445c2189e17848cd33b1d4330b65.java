package com.ht;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class IOStreamDome01 {
	public static void main(String[] args)  {
		
		String filepath ="D:\\Workspace\\javaDome\\src\\com\\ht\\he.txt";
		BufferedReader bufferedreader = null;
		String line = "";
		int lineNum =0 ;
		try {
			 bufferedreader = new BufferedReader(new FileReader(filepath));
			while((line = bufferedreader.readLine())!= null) {
				//—≠ª∑∂¡»°
				System.out.println(++lineNum + line);
			}
		}catch(Exception e) {
			e.printStackTrace(); 
		}finally {
			try {
			if (bufferedreader !=null) {
				bufferedreader  .close();
			}
		}catch(Exception e) {
			e.printStackTrace(); 
		
			}
		}
	}
}
