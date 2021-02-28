package com;

public class MyMain {
	public static void main(String[] args) {
		
		//Static Method Inside Class
		MyMain.staticDispInsideClass();
		//or
		staticDispInsideClass();
		
		//Non-Static Method Inside Class
		MyMain my = new MyMain();
		my.nonStaticDispInsideClass();
		
		//Non-Static Method Outside Class
		NonStaticMethodOutsideClass ns = new NonStaticMethodOutsideClass();
		ns.nonStaticDisp();
		
		//Static Method Outside Class
		StaticMethodOutsideClass.staticDisp(); 
	    }
	    
    static void staticDispInsideClass() {        
	        System.out.println("Static Method Inside Class");
	    }
	
	void nonStaticDispInsideClass() {
        System.out.println("Non-Static Method Inside Class");
        }
}

class NonStaticMethodOutsideClass {
	void nonStaticDisp()
	{
		System.out.println("Non-Static Method Outside Class");
	}
}

class StaticMethodOutsideClass {
	static void staticDisp()
	{
		System.out.println("Static Method Outside Class");
	}
}




