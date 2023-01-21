/*
 * Create a class named 'Member' having the following members:
    Data members
    1 - Name
    2 - Age
    3 - Phone number
    4 - Address
    5 - Salary
    It also has a method named 'printSalary' which prints the salary of the members.
    Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 
    'Manager' classes have data members 'specialization' and 'department' respectively. 
    Now, assign name, age, phone number, address and salary to an employee and a manager by 
    making an object of both of these classes  and print the same.

 * */
package Shruti_mam;

import java.util.Scanner;

class Member {
	String name;
	int age;
	long mobileNum;
	String add;
	float salary;

	void printSalary() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
		System.out.println("Mobile Number : " + mobileNum);
		System.out.println("Address : " + add);
	}
}

class Employee extends Member {
	String specialization;

	void print() {
		System.out.println("specialization : " + specialization);
	}
}

class Manager extends Member {
	String department;

	void print() {
		System.out.println("Department : " + department);
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Employee obj = new Employee();

		System.out.println("Enter Name : ");
		obj.name = scr.next();
		System.out.println("Enter Age : ");
		obj.age = scr.nextInt();
		System.out.println("Enter Phone Number : ");
		obj.mobileNum = scr.nextLong();
		scr.nextLine();
		System.out.println("Enter Address : ");
		obj.add = scr.nextLine();
		System.out.println("Enter salary : ");
		obj.salary = scr.nextInt();
		scr.nextLine();
		System.out.println("Specialization : ");
		obj.specialization = scr.nextLine();
		obj.printSalary();
		obj.print();

		Manager obj1 = new Manager();

		System.out.println("Enter Name : ");
		obj1.name = scr.next();
		System.out.println("Enter Age : ");
		obj1.age = scr.nextInt();
		System.out.println("Enter Phone Number : ");
		obj1.mobileNum = scr.nextLong();
		scr.nextLine();
		System.out.println("Enter Address : ");
		obj1.add = scr.nextLine();
		System.out.println("Enter salary : ");
		obj1.salary = scr.nextInt();
		scr.nextLine();
		System.out.println("Department : ");
		obj1.department = scr.nextLine();
		obj1.printSalary();
		obj1.print();
	}
}
