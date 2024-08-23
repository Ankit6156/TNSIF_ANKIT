package com.tnsif.day7.Keywords.StaticAbstractFinal;
abstract class value{
	 void show() {
		 System.out.println("Abstract");
	 }
 }
class value1 extends value {
	void dshow() {
		System.out.println("Value");
	}
}

public class Student {
	//abstract int a;//it's not possible to create a
public static void main(String[] args) {
	value1 obj=new value1();
	obj.show();
	obj.dshow();
}
}
