package com.exercises;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Phase0Exercises {

	public static void main(String[] args) {
		//Exercise 1
		
		System.out.println("Exercise 1 answers:");
		System.out.println(typingTimeCalc(-1,0,0,0));
		System.out.println(typingTimeCalc(6,32,5,40));
		
		
		//Exercise 2 : Part 1
		
		System.out.println("Exercise 2 answers:");
		System.out.println("Greatest Number:" + greatestNumber(43,91,183));
		
		//Exercise 2 : Part 2
		
        int[] arrNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
        arrNumbers[i] = ThreadLocalRandom.current().nextInt(10, 50 + 1);
        }
        System.out.println("Numbers: " + divisibleBy2(arrNumbers)); 
        
        
		//Exercise 3
        
        System.out.println("Exercise 3 answer:");
		System.out.printf("Time Taken By train: %.2f", timeTakenByTrain(45,32,500));
		System.out.println();
		
		
		//Exercise 4
		
		System.out.println("Exercise 4 answer:");
		System.out.println("Students Passed: " +studentsPassed(230));
		
		
		//Exercise 5
 
        System.out.println("Exercise 5 answer:");
		System.out.println("Avg. Students Passed: " +avgNoOfStudentsPassed(230));
		
		
		//Exercise 6
		
        System.out.println("Exercise 6 answer:");
        int[] arrInts = new int[5];
        for (int i = 0; i < 5; i++) {
        arrInts[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        }
        for (int i = 0; i < 5; i++) {
        System.out.print(arrInts[i]);
        }
        System.out.println();
		System.out.println(smallestPositiveInteger(arrInts));
		
		
		//Exercise 7
		
		System.out.println("Exercise 7 answer:");
		System.out.println(sumOfEvenNumbers(6));
		System.out.println(sumOfEvenNumbers(32));
		
		
        //Exercise 8
		
		System.out.println("Exercise 8 answer:");
		System.out.println(consecutiveVowels("team"));
		System.out.println(consecutiveVowels("the"));
		

	}
	
	//Exercise 1 method
	static String typingTimeCalc(int aHours, int aPages, int bHours, int bPages)
	{ 
	  //hard-coded value for result work to be done
	  int noOfPages = 110; 
	  // total work done by A and B in an hour
	  double aPlusBWork = (double)bPages/bHours + (double)aPages/aHours; 
	  double result = noOfPages/aPlusBWork;

		  return "Time Taken: " + result;
    }
	
	//Exercise 2 methods
	static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}
	
	static int greatestNumber(int a, int b, int c)
	{ 

       return hcf(hcf(b-a, c-b), c-a);

	}


	static ArrayList<Integer> divisibleBy2(int[] arrNum)
	{ 
		ArrayList<Integer> resultArr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) 
        {

        if (arrNum[i] % 2 == 0 )
        {
        	resultArr.add(arrNum[i]);     	
        }
        }
        Collections.sort(resultArr);
        return resultArr;
    }
	
	//Exercise 3 method
	static double timeTakenByTrain(double X, double Y, double slowerTrainLength)
	{ 
	
    double relSpeedInMSec = (double)(X + Y) * 0.277;
	return slowerTrainLength / relSpeedInMSec;

    }
	
	//Exercise 4 method
	static int studentsPassed(int N)
	{ 
     int noOfExamTakers =  (int)(0.9 * N);
     return (int)(0.66 * noOfExamTakers);
    }
	
	static int avgNoOfStudentsPassed(int N)
	{ 
     return (int)(0.66 * 0.9 * N);
    }	
	
	//Exercise 6 method
	static String smallestPositiveInteger(int[] arr)
	{ 
     Arrays.sort(arr);
     Integer result = Integer.MAX_VALUE;
     for (int i = (arr.length) - 1; i >= 0 ; i--)
     {
    	 for(int j = 0; j < arr.length - 3; j++)
    	 {
    		 if (arr[j] + arr[j+1] == arr[i])
    		 {
    			if( arr[i] < result)
    			{
    			 result = arr[i];
    			}
    		 }
    	 }
     }
     if (result == Integer.MAX_VALUE)
     {
    	 return "No Smallest Positive Integer in the array which can be formed from the sum of two numbers. ";
     }
     return "Smallest Positive Integer: " + result;
    }	
	//Exercise 7 method
	static int sumOfEvenNumbers(int N)
	{ 
	//No of digits up to N Excluding N
    int numDigits = N/2 - 1;
    return numDigits * (numDigits + 1); 

    }	
	//Exercise 8 method
	static String consecutiveVowels(String str)
	{ 
	String vowel = "aeiou";
	for(int i= 0; i <= str.length() - 2; i++)
	{
		if ((vowel.contains(Character.toString(str.charAt(i)))) && (vowel.contains(Character.toString(str.charAt(i+1)))))
		{
		    return "Consecutive Vowels Present";
		}
	}
    return "No Consecutive Vowels";
    }	
  
}  
