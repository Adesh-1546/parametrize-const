package com.assignment.constructor;
//Define an Employee class with a parameterized constructor that accepts id, name, and salary.
//Print the employee details.


public class Employee {
	//instance variable
	int id;
	String name;
	double salary;
	
	// creating a constructor
	public Employee(int id,	String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//method for displaying
	public void display() {
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name );
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		Employee em = new Employee(12354, "ADESH", 15466.7);
	}

}
