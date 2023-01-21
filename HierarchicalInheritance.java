package Shruti_mam;

import java.util.Scanner;

class Shape {
	float Pi = 3.14f;

	float l, h, r;
	Scanner scr = new Scanner(System.in);

	void rectangleInput() {

		System.out.println("Enter value of L : ");
		l = scr.nextFloat();
		System.out.println("Enter value of H : ");
		h = scr.nextFloat();

	}

	void circleInput() {
		System.out.println("Enter value of R : ");
		r = scr.nextFloat();
	}
}

class Rectangle extends Shape {
	void rArea() {
		System.out.println("Area of Rectangle is " + (l * h));
	}
}

class Circle extends Shape {
	void cArea() {
		System.out.println("Area of Circle is " + (Pi * r * r));
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Rectangle robj = new Rectangle();
		robj.rectangleInput();
		robj.rArea();

		Circle cobj = new Circle();
		cobj.circleInput();
		cobj.cArea();

	}
}
