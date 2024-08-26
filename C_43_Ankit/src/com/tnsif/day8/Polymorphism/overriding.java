package com.tnsif.day8.Polymorphism;

 class Parent {
	void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

public class overriding {
    public static void main(String[] args) {
        Parent obj1 = new Parent ();
        obj1.show();// Calls Parent's show()

        Parent obj2 = new Child();
        obj2.show(); // Calls Child's show()
    }

}
