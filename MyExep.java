package com;

public class MyExep extends Exception{
	
	public MyExep() {
		
		System.out.println("Invalid Age");
	}
    
	public String toString() {
		
		return "Exception: Age < 18 or Age >= 60";
	}
}
