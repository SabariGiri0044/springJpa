package com.Sabu.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
private int S_id;
private String S_name;
public int getS_id() {
	return S_id;
}
public void setS_id(int S_id) {
	this.S_id =S_id;
	
}
	public String getS_name() {
		return S_name;
		
	}
	public void setS_name(String S_name) {
		this.S_name=S_name;
		
	}
	@Override
	public String toString() {
		return "Laptop [S_id=" + S_id + ", S_name=" + S_name +"]";
		
	}
	public void display() {
	System.out.println("Inside Laptop");
	}
}
