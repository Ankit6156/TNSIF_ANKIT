package com.tnsif.day3.oops;

public class Encapsulation {
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
		Encapsulation obj=new Encapsulation();
		obj.setName("Ankit");
		obj.setAge(20);
		obj.setDept("CSE");
		System.out.println(obj);
	}

}
