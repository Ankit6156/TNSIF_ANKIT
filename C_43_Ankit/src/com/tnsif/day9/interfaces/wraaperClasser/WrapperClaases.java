package com.tnsif.day9.interfaces.wraaperClasser;

public class WrapperClaases {
	public static void main(String[] args) {
		
		/*
		  primitive type              wrapper class
		  char                         Character
		  byte                           Byte
		  short                          Short
		  int                            Integer
		  long                            Long
		  float                           Float
		 */
		//unboxing - Converting explicitly
		Integer i= new Integer(10);
		System.out.println(i);
		//predefine value
		int b=i.intValue();
		System.out.println(b);
		//Without using intValue
		int c=i;
		System.out.println(c);
		// Autoboxing - Converting Implicitly
		int a=100;
//		Integer /	System.out.println(i1);
		
	}

}
