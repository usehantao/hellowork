package com.jiheDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Properties;

public class HomeWork03 {
	public static void main(String[]args) throws Exception, Exception {
		
		Properties pr =new Properties();
		pr.load(new FileReader("src/dog.properties"));
		String name =pr.get("name")+"";
		int age = Integer.parseInt(pr.get("age")+"");
		String color =pr.get("color")+"";
		
		Dog dog = new Dog(name,age,color);
		//System.out.print(dog);
		
		String serFilePath ="/Users/apple/Desktop/f1.dat";
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(serFilePath));
		os.writeObject(dog);
		os.close();
		//System.out.print("序列化完成");
		
		m1();
		
		
	}
	public static void m1() throws Exception{
		String serFilepath ="/Users/apple/Desktop/f1.dat";
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream(serFilepath));
		Dog dog =(Dog)oos.readObject();
		oos.close();
		System.out.print("反序列化后"+dog);
		
	}

}
class Dog implements Serializable{
	private String name;
	private int age;
	private String color;
	
	public Dog(String name ,int age ,String color) {
		this.name=name;
		this.age=age;
		this.color=color;
		
		
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
	
}
