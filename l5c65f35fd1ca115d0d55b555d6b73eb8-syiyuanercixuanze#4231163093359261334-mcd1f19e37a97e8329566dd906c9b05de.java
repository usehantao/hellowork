package com.ht;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDeom01 {
	public static void main(String[]args) throws Exception {
		Properties porperties = new Properties();
		
		porperties.put("facai", "123456");
		porperties.put("huahua", "234567");
		porperties.put("mantou", "345678");
		System.out.println(porperties);
		//����һ Ϊ����ܵ� ������ ע�� �����ĵ�
		porperties.store(new FileWriter("e://haha.porperties"), "this is User");
	}
}
