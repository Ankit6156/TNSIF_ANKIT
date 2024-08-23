package com.tnsif.day9.interfaces.wraaperClasser;
 interface one{
	 // only abstract method
	 //will have default public abstract
	 int age=20;// final & static
	 void show();// default  public Abstract
	 void age();
 }
class two implements one{
	@Override
	public void show() {
		System.out.println("Interface method one");
	}
	@Override
	public void age() {
		System.out.println(age);
	}
	
}
public class interfacesDemo {
	public static void main(String[] args) {
		two obj=new two();
		obj.show();
		obj.age();
	}

}
