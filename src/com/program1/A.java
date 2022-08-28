package com.program1;

public class A {

	public A() {
	this(12);
	System.out.println("default constructor");
	
	}

	public A(int a) {
		this("Simson");
		System.out.println(155);
		
		}
	public A(String name) {
		
		System.out.println("Love you");
		
		}
	
	public static void main(String[] args) {
		
		A a = new A();
		
	}
	
}
