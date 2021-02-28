package dsjava;

public class Javak {

	public static void main(String[] args) {

		String[] cars = { "100", "110", "010", "011", "100" };

		//String[] cars= { "0011", "0111", "0111", "0110", "0000" };

		int[] sol = new int[cars.length];

		for (int i = 0; i < cars.length; i++) {

			int count = 0;
			for (int j = 0; j < cars.length; j++) {
				
				if (i == j)
					continue;

				System.out.println("****" + i + "****" + j);
				System.out.println(cars[i]);
				System.out.println(cars[j]);
				System.out.println(isSimilar(cars[i], cars[j]));
				System.out.println(count);

				if (isSimilar(cars[i], cars[j]))
					count++;
				
				System.out.println(count);
			}
			sol[i] = count;
			System.out.println("**" + count);
		}

		for (int i : sol)
			System.out.println(i);

	}

	public static boolean isSimilar(String a, String b) {

		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			if ( a.charAt(i) != '0' && a.charAt(i) != '0' && a.charAt(i) != b.charAt(i)) {
				count++;
			}
		}

		return count <= 1;
	}

}
