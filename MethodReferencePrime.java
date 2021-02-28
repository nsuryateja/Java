package interfaces;

public class MethodReferencePrime {
	public static void main(String args[]) {

		Prime p = isPrime::primeCheck;
		int num = (int) (Math.random() * 50) + 2;
		System.out.println(num);
		System.out.println(p.isPrime((int) num));
	}
}

class isPrime {

	public static boolean primeCheck(int num) {
		for (int i = 2; i < num; i++) {
			if (num % 2 != 0)
				continue;
			else
				return false;
		}
		return true;

	}
}
