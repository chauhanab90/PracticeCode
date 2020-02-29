package com.cg.app;

public class Product {

	
	
	
	private int id;
	private String name;
	
	static{
		
		System.out.println("min balance");
		System.out.println("send sms");
		System.out.println("This is first static block"); 
		
	}
	
	{
		
		int add= 10+10+20+20;
		System.out.println(add);
		//System.out.println("This is first instance block ");
	}
	{
		System.out.println("this is another block");
	}
	
	
	public Product(int is, String name){
		
		this.id=id;
		this.name=name;
		
	}
	public Product(){
		
	}
	
	public Product(int id){
		
		this.id=id;
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	{
		System.out.println("this is instance block ");
	}
	
	static{
		System.out.println("this is second dtatic block");
	}
}
