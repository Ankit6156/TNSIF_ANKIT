package com.tnsif.day10.exceptionhandling;
import java .util.*;
public class FinallyBlock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			int num=sc.nextInt();
				System.out.println( num %2==0? num+" is Even" :num +" is odd");
				return;
		}
		//we can use only Exception and one obj like e;
		catch(InputMismatchException e){
			System.out.println("Invalid input");
			
		}
		finally {
			System.out.println("In finally...");
			sc.close();
			
		}
		
	}

}
