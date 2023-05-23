package com.ht;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Properties;

public class HomeDome {
	public static void main(String[]args) throws Exception, IOException {
		
		String filepath = "src\\dog.properties";
	
		Properties pp  = new Properties();
		
		pp.load(new FileReader(filepath));
		
		pp.list(System.out);
		
		String name  = pp.get("name" ) + ""; //Object ת��String
		
		int age =Integer.parseInt(pp.get("age")+ ""); ////Object ת�� int
		
		String color = pp.get("color") + ""; //Object ת��String
		
		Dog dog = new Dog(name, age,color);
		System.out.println("=====dog��Ϣ==========");
		System.out.println(dog);
		
		//��������Dog�������л����ļ�dog.dat�ļ�
		String  serFilepath = "e:\\dog.dat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilepath));
		oos.writeObject(dog);
		
		//�ر���
		oos.close();
		System.out.println("dog�������л����");
	}
}

class Dog implements Serializable{
	private String name;
	private int age;
	private String color;
	
	public Dog(String name ,int age ,String color) {
		this.name = name;
		this.age =age ;
		this.color =color;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
}
