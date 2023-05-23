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
		
		String name  = pp.get("name" ) + ""; //Object 转成String
		
		int age =Integer.parseInt(pp.get("age")+ ""); ////Object 转成 int
		
		String color = pp.get("color") + ""; //Object 转成String
		
		Dog dog = new Dog(name, age,color);
		System.out.println("=====dog信息==========");
		System.out.println(dog);
		
		//将创建的Dog对象，序列化到文件dog.dat文件
		String  serFilepath = "e:\\dog.dat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilepath));
		oos.writeObject(dog);
		
		//关闭流
		oos.close();
		System.out.println("dog对象序列化完成");
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
