package Shruti_mam;

/*
 * => Constructor :
 * 
 * 		-> name of constructor is same as class name.
 * 		-> do not have return type
 * 		-> use : initialize the instance variable
 * 		-> constructor call automatically when objects are created.
 * 
 * 		there are three type of constructor.
 * 		
 * 		1. default constructor
 * 		2. parameterized constructor
 * 		3. copy constructor 
 * */
class Sample {
	int x;
	float y;

	Sample() {// default constructor
		System.out.println(x);
		System.out.println("Default constructor called!!!");
		x = 50;
	}

	Sample(int z) {
		System.out.println("Parameterized cconstructor called!!!");
		x = z;
	}

	Sample(int a, int b) {
		x = a;
		y = b;
	}

	Sample(Sample s) {
		x = s.x; 
	}
}

public class Constructor {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1.x);

		Sample s2 = new Sample();
		System.out.println(s2.x);
		System.out.println(s2.y);

		Sample s3 = new Sample(10);
		System.out.println(s3.x);

		Sample s4 = new Sample(20, 30);
		System.out.println("x = " + s4.x + " y = " + s4.y);

		Sample s5 = new Sample(s4);
		System.out.println("x = " + s5.x);
		System.out.println(s4.x);
	}
}
