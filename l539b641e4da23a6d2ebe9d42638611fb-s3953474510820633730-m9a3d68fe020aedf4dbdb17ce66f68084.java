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
			 //������ ����
			 if(file.mkdirs()) {
				 System.out.println("����" + directoryPath + "�����ɹ�");
				 
			 }else {
				 System.out.println("����" + directoryPath + "����ʧ��");
			 }
		 }
		 
		 
		 
		 String filePath = "e:\\mytemp\\hello.txt"; 
		 file = new File(filePath);
		 if(file.exists()) {
			 //�����ļ�
			 if(file.createNewFile()) {
				 System.out.println("����" + filePath + "�����ɹ�");
				 
				BufferedWriter bufferedwriter = new BufferedWriter (new FileWriter(file));
				bufferedwriter.write("Hello World!");
				bufferedwriter.close();
			 }else {
				 System.out.println("����" + filePath + "����ʧ�ܳɹ�");
			 }
		 }else {
			 System.out.println( filePath + "�Ѿ�����");
		 }
		 
		 
		 
		 

	}

}
