package com.cg.app;

public interface MyInterface {
	
	
	/*public static final int a=20;
	 *                         
	 * public static final int b=10;
	 * 
	 * we can use these variable also in interface 
	 */
	
	
	public int add(int a, int b);
	
	public int sub(int a, int b);
	
	default public int sq(int a){
		
		return a*a;
				
	}
	static public void staticmethod(){
		System.out.println("This is implemented by Capgemini");
	}

}
