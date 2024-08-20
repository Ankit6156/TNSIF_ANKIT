package com.tnsif.day3.oops;

public class Constructor {
		
	public Constructor() {
		System.out.println( "Default Constarctor");
	}
	public Constructor( String ConstructorName, int ConstructorAge, String ConstructorDept) {
		System.out.println("Prameterized Constuctor");
		this.name=ConstructorName;
		this.age=ConstructorAge;
		this.dept=ConstructorDept;
	}
	String name; //data members and instance variable
	int age; 
	String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return  "Name="+name+", Age="+age+",Dept="+dept;
		}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		obj.setName("Ankit");
		obj.setAge(20);
		obj.setDept("CSE");
		System.out.println(obj);
	}

}

