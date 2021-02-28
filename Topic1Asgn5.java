package phase1;

public class Topic1Asgn5 {

	public static void main(String[] args) {
		
        fourDigitSum(3629);

	}
   public static void fourDigitSum(int num)
   {
	   int sum = 0;
	   int noOfDigits = Integer.toString(num).length();
	   int div = (int) Math.pow(10, noOfDigits);

	   for(int i = 0; i <= noOfDigits; i++)
	   {
		   sum += num/div;
           num %= div;
		   div /= 10;
	   }
	   
	   System.out.println("The sum of all the digits entered is: " + sum);
   }
}
