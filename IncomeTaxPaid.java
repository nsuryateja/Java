package com.exercises;
import java.util.Scanner;

public class IncomeTaxPaid {
	
	public static void main(String args[])
	{
		
	double taxToBePaid=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Gross Income ");
	double GrossIncome= scanner.nextDouble();
	
	if(GrossIncome<=150000)
		taxToBePaid = 0;
	else if( GrossIncome > 150000 && GrossIncome <= 300000)
		taxToBePaid = 0.1*GrossIncome;
	else if( GrossIncome > 300000 && GrossIncome <= 500000)
		taxToBePaid = 0.15*GrossIncome;
	else 
		taxToBePaid = 0.25*GrossIncome;
	
	scanner.close();
	System.out.println("Income tax to be paid is " + taxToBePaid);
	}

}
