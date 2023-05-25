package com.ht;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo {
	public static void main(String[]args) throws Exception {
		//1.创建学生对象
		Student s =new Student("facai" ,18 ,"男");
		//2.对象序列化，对象字节输出流
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("E:\\student.txt"));
		
		//3.直接调用序列化方法
		os.writeObject(s);
		os.close();
		}
	
	}

class Student implements Serializable{
	private String name;
	private int age;
	private String sex;
	
	public Student(String name ,int age ,String sex) {
		this.name =name;
		this.age =age;
		this.sex =sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
