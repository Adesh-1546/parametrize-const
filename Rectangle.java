package com.assignment.constructor;
//Create a Rectangle class with a parameterized constructor that takes length and width as parameters.
//Calculate and display the area.

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void displayArea() {
    	double area = length * width ;
        System.out.println("Rectangle Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.displayArea();
    }
}