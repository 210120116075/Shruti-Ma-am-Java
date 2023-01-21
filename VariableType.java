package Shruti_mam;
/*
 * (1) => Local Variable -> Local variable must intialize.
 * (2) => Instance Variable -> Instance Variable have Default Values.
 * (3) => Static Variable -> 
 * */

class Test {
	int x = 10;// Instance Variable

	void print() {
		int y;// Local Variable mus intialize when it use.
		y = 60;
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);
	}

	int z;// Instance Variable
}

public class VariableType {
	int r;

	public static void main(String[] args) {
		int c = 40;// Local variable
		System.out.println("C = " + c);
		Test obj = new Test(); 
		obj.print();

		VariableType obj2 = new VariableType();
		System.out.println("r = " + obj2.r);
		obj2.display();

	}

	void display() {
		System.out.println("r = " + r);
	}
}
