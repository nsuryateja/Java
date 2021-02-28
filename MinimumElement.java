import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter count: ");
		
		int count = scanner.nextInt();
		
		int[] Arr = readIntegers(count);
		
		int min = findMin(Arr);
		
		System.out.println("Min: " + min);

	}
	
	public static int[] readIntegers(int count) {
		
	int[] Arr = new int[count];
	
	System.out.println("Enter " + count + " Elements:" );
	
	for(int i =0; i< count;i++)
	{
		Arr[i] = scanner.nextInt();
	}
	
	return Arr;
	}
	
	public static int findMin(int[] array)
	{
		int[] Arr = Arrays.copyOf(array, array.length);
		
	    int temp = Arr[0];
	    
	    for(int i =1; i< Arr.length; i++)
	    {
	    	if(Arr[i] < temp)
	    	{
	    		temp = Arr[i];
	    	}
	    }
	    
	    return temp;
	}

}
