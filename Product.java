package com.assignment.constructor;

public class Product {
	
	    private int productId;
	    private String productName;
	    private double price;

	    public Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    public void ProductDetails() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: $" + price);
	    }

	    public static void main(String[] args) {
	        Product product1 = new Product(101, "Smartphone", 699.99);
	        product1.ProductDetails();
	    }
	

}
