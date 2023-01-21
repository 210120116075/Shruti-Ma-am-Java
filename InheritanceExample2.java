/*
 * Create a class with a method that prints "This is parent class" 
 * and its subclass with another method that prints "This is child class". 
 * Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

 * */
package Shruti_mam;

class Parent {
	void parentMethod() {
		System.out.println("This is parent class.");
	}
}

class Child extends Parent {
	void childMethod() {
		System.out.println("This is Child class.");
	}
}

public class InheritanceExample2 {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.parentMethod();

		Child obj2 = new Child();
		obj2.childMethod();

		Child obj = new Child();
		obj.parentMethod();
	}
}
