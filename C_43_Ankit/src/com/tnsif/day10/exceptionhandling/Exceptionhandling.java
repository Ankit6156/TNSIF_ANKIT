package com.tnsif.day10.exceptionhandling;

public class Exceptionhandling {
	// program wiyhou exception handling
	public void Demo() {
		System.out.println("The program continious....");
		int data=100/0;
		System.out.println(data);
	}
	public void show(){
		try {
			Demo();
			// throw new Exception(); Syntax for throw		
		
	}
		catch(Exception e) {
			System.out.println("Exception ----->"+e);//detailed message
		}
		finally {
			System.out.println("Hello world");
		}
	}
	public static void main(String[] args) {
		Exceptionhandling obj=new Exceptionhandling();
		obj.show();
	}

}
