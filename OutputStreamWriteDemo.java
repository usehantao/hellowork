package com.ht;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class OutputStreamWriteDemo {
	public static void main(String[]args) throws Exception {
		
			//1.����һ���ֽ������
			OutputStream os = new FileOutputStream("E:\\ht.txt");
			//2.��ԭʼ���ֽ������ת�����ַ����
			//Writer oos =new OutputStreamWriter(os); //Ĭ��ΪUTF-8
			Writer osw = new OutputStreamWriter(os , "GBK");

			BufferedWriter bw = new BufferedWriter (osw);

			
			bw.write("����xxxx");
			bw.write("����xx");
			bw.write("��ͷxxx");
			
			bw.close();
		
	}
}
