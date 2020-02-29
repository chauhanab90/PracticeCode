package com.cg.app;

public class ScientificCalculator implements MyInterface{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
	
		return a-b;
	}

	
	
	@Override
	public int sq(int a) {
		System.out.println(" This is implemented in scientific calculator");
		return a*a;
	}
}
