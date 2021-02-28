package com.exercises;
import java.util.*;
import java.util.stream.Collectors;

public class CharacterStrength 
{   
	public static void main(String[] args) 
	
	{
		//Range of weights 
		String[] s0 = {"1-26"};
		String[] s1 = {"5-9","6-26"};
		String[] s2 = {"9-12","10-12","5-5","5-22"};
		String[] s3 = {"1-12","12-15"};
		
		
		Map<String, Integer> result0 = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> result1 = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> result2 = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> result3 = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		
		
		String[] str1 = {"JAVA","sunny","surya teja","teja","technologies","Apple","orange"};
		
		System.out.println("*****Output 1********");
		if  (checkConstraint(s0[0]) == 0)
		{
		for (String str : str1) 
		{
			result0.put(str, strengthOf(str,alphabetDict(s0[0])));
		}
		displayOutput(str1,result0);
		}
		else
			System.out.println("INVALID INPUT RANGE");
		
		System.out.println("*******Output 2********");
		if  (checkConstraint(s1[0],s1[1]) == 0)
		{
		for (String str : str1) 
		{
			result1.put(str, strengthOf(str,alphabetDict(s1[0],s1[1])));
		}
		displayOutput(str1,result1);
		}
		else
			System.out.println("INVALID INPUT RANGE");
		
		
		System.out.println("*******Output 3********");
		if  (checkConstraint(s2[0],s2[1],s2[2],s2[3]) == 0)
		{
		for (String str : str1) 
		{
			result2.put(str, strengthOf(str,alphabetDict(s2[0],s2[1],s2[2],s2[3])));
		}
		displayOutput(str1,result2);
		}
		else
			System.out.println("INVALID INPUT RANGE");
		
		
	    System.out.println("********Output 4*******");
		if  (checkConstraint(s3[0],s3[1]) == 0)
		{
		for (String str : str1) 
		{
			result3.put(str, strengthOf(str,alphabetDict(s3[0],s3[1])));
		}
		displayOutput(str1,result3);
        }
	    else
		    System.out.println("INVALID INPUT RANGE");
}
	
	static void displayOutput(String[] str1,Map<String, Integer> result)
	{

	    //swap keys with values
	    Map<Integer, String> swapped = result.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
	   
	    ArrayList<Integer> keys = new ArrayList<Integer>(swapped.keySet());
	    
	    //Sort in Descending Order
		Collections.sort(keys,Collections.reverseOrder());
			
		//print the result in Value : Key Format eg: wipro : 61 --> lower case
	    for (int i = 0; i< keys.size(); i++)
	    {
	    	System.out.println(swapped.get(keys.get(i)).toLowerCase() + " : " + keys.get(i));
	    }
	}
	 

    
	static int strengthOf(String word,Map<String, Integer> alpha_format)
	{
	int sum = 0;
	for (int i = 0;i < word.length();i++)
	{   
		String resStr = Character.toString(word.charAt(i));
		if (!(resStr.equals(" ")))
	         sum += alpha_format.get(resStr);
	}
	return sum;
	}

	static Map<String,Integer> alphabetDict(String ... args)
	{
	char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	Map<String, Integer> result = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
	int alpha_index = 0;
    for (int i =0; i < args.length; i++)
    {   
    	String str = args[i];  
    	String[] arrOfStr = str.split("-");
    	int lowerBound = Integer.parseInt(arrOfStr[0]),upperBound = Integer.parseInt(arrOfStr[1]); 
    
    	if (upperBound != lowerBound)
    	{
    	for (int j = lowerBound; j <= upperBound ; j++) //5 20
    	{
    		result.put(Character.toString(alphabet[alpha_index]), j);
    		alpha_index++;
    	}	
    	}
    	else
    	{	 
    		result.put(Character.toString(alphabet[alpha_index]), lowerBound);
    		alpha_index++;
    	}
   }
    return result;
	}
	
	static int checkConstraint(String ... args)
	{
    	int count = 0;
		for (int i =0; i < args.length; i++)
		{
	    	String str = args[i];  
	    	String[] arrOfStr = str.split("-");
	    	int lowerBound = Integer.parseInt(arrOfStr[0]),upperBound = Integer.parseInt(arrOfStr[1]);
	    	if (upperBound < lowerBound)
	    		return 0;
	    	if(upperBound != lowerBound)
	    	      count += upperBound - lowerBound + 1;
	    	else
	    		  count += 1;
		}
    	if(count == 26)
    		return 0;	
    	return -1;
	}

	}


	

