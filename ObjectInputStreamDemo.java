package com.ht;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
		public static void main(String[]args) throws Exception {
			//1.���������ֽ��������ܵ�
			ObjectInputStream is = new ObjectInputStream( new FileInputStream("E:\\\\student.txt"));
			//2.���ö����ֽ�������
			Student  s = (Student)is.readObject();
			System.out.println(s);
			
			}
		}


