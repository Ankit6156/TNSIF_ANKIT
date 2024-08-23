package com.tnsif.day9.interfaces.wraaperClasser;
 interface parent1{
	 public void show();
 }
 interface parent2{
	 public void disp();
 }
 class myclass{
	 public void display() {
		 System.out.println("Metrhod in class");
	 }
	 
 }
 class child extends myclass implements  parent1,parent2{
	 @Override
	 public void disp() {
		 System.out.println("Hello");
	 }
	 @Override
	 public void show() {
		 System.out.println("Welcome");
	 }
 }
public class MultipleinterfacesDeno {
	
public static void main(String[] args) {
	child obj=new child();
	obj.disp();
	obj.show();
	
}
}
