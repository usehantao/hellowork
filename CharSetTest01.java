package com.ht;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharSetTest01 {
	public static void main(String[]args) throws Exception {
		//1��ȡGBK�ļ���ԭʼ�ֽ���
		InputStream is = new FileInputStream ("E:\\ht.txt");
		Reader isr =new InputStreamReader(is, "GBK"); // ��ָ����GBK����ת�����ַ�������
		BufferedReader br =new BufferedReader(isr);
		 String line;
		while((line = br.readLine()) != null){
		System.out.println(line);
			}
		}
	}


