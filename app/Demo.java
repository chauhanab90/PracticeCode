package com.cg.app;

public class Demo {
	
	public static void main(String[] args) {
		
		
		System.out.println("Simple Calculator");
		Calculator cl = new Calculator();		
		MyInterface.staticmethod();
		System.out.println(" Add " + cl.add(10, 2));
		System.out.println(" Sub " +  cl.sub(20, 10));
		System.out.println(" Square " + cl.sq(10));
		
		
		
		
		
		System.out.println("Scientific Calculator");		
		ScientificCalculator sc = new ScientificCalculator();
		MyInterface.staticmethod();
		System.out.println(" Add " + sc.add(10, 2));
		System.out.println(" Sub " + sc.sub(10, 2));
		System.out.println(" Square " + sc.sq(10));
		
		
		
		
	}

}
