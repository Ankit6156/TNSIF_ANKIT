package com.tnsif.day2.keywordsPrimitiveLooping;
import java.util.*;
public class KeyWords {
		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        int a=scan.nextInt();
	        double b=scan.nextDouble();
	        String c=scan.nextLine();
	        c=scan.nextLine();
	         int sum=i+a;
	         System.out.println(sum);
	         double Sum=d+b;
	         System.out.println(Sum);
	         String Add= s.concat(c);
	         System.out.println(Add);
	        scan.close();
	    }
	}


