package com.stackroute;

public class Member {
	//Name, age, Salary
	
	private String name;
	private int age;
	private double salary;
	
	public Member(String name,int age,double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void display(){
		System.out.println("Members Name: "+this.name);
		System.out.println("Members Age: "+ this.age);
		System.out.println("Members Salary: "+ this.salary);
	}

}
