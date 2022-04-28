package com.Sabu.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private int S_id;
private String S_name;

@Autowired
private Laptop laptop;
public int getS_id() {
	return S_id;	
}
public String getS_name() {
	return S_name;
}
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public void setS_id(int s_id) {
	S_id = s_id;
}
public void setS_name(String s_name) {
	S_name = s_name;
}
@Override
public String toString() {
	return "Student[S_id=" + S_id + ", S_name=" + S_name + ", laptop=" + laptop + "]";
}
public void show() {
	System.out.println("Inside Student");
	laptop.display();
}
}
