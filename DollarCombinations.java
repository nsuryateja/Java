package com.exercises;

public class DollarCombinations 
{

	public static void main(String[] args) 
	{
    
	//denominations
    int d1 = 1, d2 = 10, d3 = 15;
    // no of coins for each denomination
    int noOfd1 = 5,noOfd2 = 2,noOfd3 = 1;
    // result dollar
    int res = 20;
  
    for (int a = 0; a <= noOfd1 ; a++)
    {
    	for (int b = 0; b <= noOfd2 ; b++)
        {
    		for (int c = 0; c <= noOfd3 ; c++)
    	    {
    	    if( d1 * a + d2 * b + d3 * c == res)
    	    {
    	    	System.out.print("Combination: " + "a: " + a + ", b: " + b + ", c: " + c + " --->");
    	    	System.out.printf(" %d * %d + %d * %d + %d * %d = %d",a,d1,b,d2,c,d3,res);
    	    	System.out.println();
    	    }
    	    }
        }
    }

	}

}
