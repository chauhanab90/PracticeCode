package com.cg.app;

public class Block extends Product {

	public Block(int is, String name) {
		super(is, name);

	}

	public static void main(String[] args) {

		System.out.println("This is main block ");

		Product pr = new Product(101, "Abhishek");
		
		Product pr1 = new Product(20);
		
		Product p = new Product();

	}

}
