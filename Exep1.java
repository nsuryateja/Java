package com;

public class Exep1 {

	public static void main(String[] args){

     String name = args[0];
     
     int age = Integer.parseInt(args[1]);
     
     Exep1 ex = new Exep1();
    
     try {
    	 
     ex.ageExep(age);
     
     }
     catch(MyExep e){
    	 
    	 System.out.println(e);	 
     }

     
     System.out.println("Name: " + name + " Age: " + age);

	}

	private void ageExep(int age) throws com.MyExep {
		if(age < 18 || age >= 60)
			throw new MyExep();
		
	}

}
