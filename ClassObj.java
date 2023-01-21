package Shruti_mam;
//OOPS => OBJECT ORIENTED PROGRAMMING SYSTEM.(C++,JAVA)
//POPS => PROCEDURE ORIENTED PROGRAMMING SYSTEM.(C,C++)

/*
 * FEATURES OF OOPS:
 * (1) => ENCAPSULATION
 * (2) => ABSTRACTION
 * (3) => INHERITANCE
 * (4) => POLYMORPHISM
 * (5) => CLASS
 * (6) => OBJECT
 * */

class Car {
	int wheel = 4;
	String color;

	void run() {
		System.out.println("Running...");
	}

}

public class ClassObj {

	public static void main(String[] args) {

		Car bmw = new Car();
		System.out.println(bmw.wheel);
		System.out.println(bmw.color);
		bmw.color = "white";
		System.out.println(bmw.color);

		Car farari = new Car();
		System.out.println(farari.wheel);
		System.out.println(farari.color);
		farari.color = "black";
		System.out.println(farari.color);
	}
}
