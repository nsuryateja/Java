package phase1;

public class Topic1Asgn6 {

	public static void main(String[] args) {

       int[] arr = {1433,3,441,455,699,8,1834};
       
       System.out.println(maxInArrayOf(arr));
  
	}
	
	public static int maxInArrayOf(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i <arr.length; i++) {
			if ( arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		return max;
	}

}
