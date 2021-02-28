package com.exercises;
import java.util.Scanner;

public class IsHappyNumber 
{

	public static void main(String[] args) 
	{ 
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter a number to check if its a happy number: ");
	  int result = scanner.nextInt();
	  while( result > 9)
	  {
		  result = digitSum(result);
	  }
	  if ( result == 1)
	  {
		  System.out.println("Happy Number");
	  }
	  else
	  {
		  System.out.println("Not a Happy Number");
	  }
	  scanner.close();
    
	}
	
    static int digitSum(int n)
    {   
        if (n != 0)
        {
            return (int) (Math.pow( n%10, 2)) + digitSum (n / 10);
        }
        else
        {
           return 0;
        }
    }

}
