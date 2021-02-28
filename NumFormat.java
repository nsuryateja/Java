package com;

public class NumFormat {

	public static void main(String[] args) {

      // name1 name2 32 45 65 7 56 43
		
		
		try {
			int[] st1Marks = {Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4])};
			
			int[] st2Marks = {Integer.parseInt(args[5]),Integer.parseInt(args[6]),Integer.parseInt(args[7])};
			
			display(args[0],st1Marks);
			
			display(args[1],st2Marks);

		}
		
		catch(NumberFormatException e) {
			
			System.out.println("Please enter integers for marks!");
		}

	}
	
	public static int avg(int [] arr) {
		
		return (arr[0] + arr[1] + arr[2] ) / arr.length;
		
	}
	
	public static void display(String name, int[] arr) {
		
		System.out.println("Average of " + name + " is " + avg(arr));
		
	}

}
