import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {

    int[] arr = {3,8,5,2,5};
    
    System.out.println("Array in normal order:" + Arrays.toString(arr));
    
    reverse(arr);

	}
   
	public static void reverse(int[] arr)
	{
		int min = 0;
		int max = arr.length - 1;
		
		while(min <= max)
		{ 
			System.out.println("min " + min);
			System.out.println("max "+ max);
			int temp = 0;
			temp = arr[min];
			arr[min] = arr[max];
			arr[max] = temp;
			min++;
			max--;
			
		}
		System.out.println("Array in normal order:" + Arrays.toString(arr));
		
	}
}
