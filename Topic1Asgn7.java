package phase1;

public class Topic1Asgn7 {

	public static void main(String[] args) {

    System.out.println(findFactorial(17));

	}
	
	public static long findFactorial(int num)
	{
		if (num == 1) {
			return 1;
		}
		else {
			return num*findFactorial(num-1);
		}
	}

}
