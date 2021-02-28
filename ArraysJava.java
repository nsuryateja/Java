import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysJava {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Integer[] Arr = getIntegers(10);
		printArray(Arr);
		Arr = sortArray(Arr);
		printArray(Arr);
	}

	public static Integer[] getIntegers(int num)
	{
		Integer[] Arr = new Integer[num];
		
		
		System.out.println("Enter Array Elements: \r");
		for( int i = 0; i < num; i++)
		{
			Arr[i] = sc.nextInt();
		}
		
		return Arr;
	}
	
	public static void printArray(Integer[] Arr) {
		
		for( int i = 0; i < Arr.length;i++)
		{
			System.out.println("Element at " + i + " is " + Arr[i]);
		}
		
	}
	
	public static Integer[] sortArray(Integer[] Arr) {
		
		Arrays.sort(Arr,Collections.reverseOrder());
		
		return Arr;
		
	}
}
