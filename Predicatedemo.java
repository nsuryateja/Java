package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicatedemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 88, 9, 10);

		// list.forEach(n->System.out.println(n));

		//eval(list, x -> x % 2 == 0); even
		//eval(list, x -> x % 2 != 0); // odd
		eval(list, isPrime::primeCheck);

	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer n : list) {
			if (predicate.test(n)) {

				System.out.println(n + "");
			}
		}
	}
}
