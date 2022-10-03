package com.programming.SpringDemo;

public class Alien {
	private int age;
	
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
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
		laptop.compile();
	}
}
