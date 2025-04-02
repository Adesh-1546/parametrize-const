package com.assignment.constructor;

//Create a Student class with a parameterized constructor to initialize name and age,
//then create an object and display the values.

public class Student {
	
		    //creating a parameterized constructor
			public Student (String name , int age) {
				System.out.println("Name : "+name);
				System.out.println("Age : "+age);
				}
			//method
			public void m1() {
				System.out.println("This is parametrized constructor");
			}
			
			
			public static void main(String[] args) {
				Student s = new Student("Adesh", 20);
				s.m1();
			}

}
