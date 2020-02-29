package com.cg.app;

public class Calculator implements MyInterface{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

}
