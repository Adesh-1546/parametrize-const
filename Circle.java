package com.assignment.constructor;

public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }


    public void displayArea() {
    	double area = PI * radius *radius ;
        System.out.println("Circle Area: " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayArea();
    }
}