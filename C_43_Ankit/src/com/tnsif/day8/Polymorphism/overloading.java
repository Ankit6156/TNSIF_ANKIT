package com.tnsif.day8.Polymorphism;

public class overloading {
	int num1;
	int num2;
	int result;
	void sum(int a, int b) {
		num1=a;
		num2=b;
		result=num1+num2;
		System.out.println("The Result is:"+result);
	}
	void sum(double a, double b) {
		num1=(int)Math.round(a);
		num2=(int)Math.round(b);
		result=num1+num2;
		System.out.println("The Result is:"+result);
	}
	
	public static void main(String[] args) {
		  overloading obj=new overloading();
		  obj.sum(3,4);
		  obj.sum(4.5, 7.6);
		
	}

}
