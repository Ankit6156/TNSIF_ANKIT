package com.tnsif.day6.inheritance;

public class inherit {
	public static class a{
	public void show() {
		System.out.println("Hi I am Parent");
	}
}
public static class a1 extends a{
	public void dshow() {
		System.out.println("Hii I am child");
	}
}
public static void main(String[] args) {
	a1 obj=new a1();
	obj.dshow();
	obj.show();	
}

}
