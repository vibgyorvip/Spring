package com.programming.SpringDemo;

public class Alien {
	private int age;
	
	private Computer com;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("age assigned !!");
	}
	public Alien() {
		System.out.println("Alien object created !!");
	}
	public void code()
	{
		System.out.println("coding ....");
		com.compile();
	}
	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
}
