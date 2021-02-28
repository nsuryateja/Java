package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Emp;

public class ComparatorEx {

	public static void main(String[] args) {

		// List<Integer> list = new ArrayList<>();
		List<Emp> empList = new ArrayList<>();

		/*
		 * list.add(103); list.add(544); list.add(574); list.add(967); list.add(838);
		 * list.add(234); list.add(747); list.add(835);
		 */

		empList.add(new Emp("Surya", 32000, 394903));
		empList.add(new Emp("Sunny", 45000, 394907));
		empList.add(new Emp("Pant", 64544, 394994));
		empList.add(new Emp("Rohit", 20000, 394965));
		empList.add(new Emp("King Kohli", 382000, 394953));

		// list.forEach(n -> System.out.println(n));

		// Comparator<Integer> namedClassCom = new ComImpl();
		Comparator<Emp> namedClassComEmp = new ComImplEmp();
		/*
		 * Comparator<Integer> anonCom = new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { if (o1 > o2) { return
		 * 1; } return -1; }
		 * 
		 * };
		 */
		Comparator<Emp> anonComEmp = new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				if (o1.getEmpSalary() > o2.getEmpSalary()) {
					return 1;
				}
				return -1;
			}

		};
		/*
		 * Comparator<Integer> lambdaCom = (o1,o2) -> {
		 * 
		 * if (o1 > o2) { return 1; } return -1; };
		 */

		Comparator<Emp> lambdaComEmp = (o1, o2) -> {

			if (o1.getEmpSalary() > o2.getEmpSalary()) {
				return 1;
			}
			return -1;

		};

		/*
		 * ComImpl comp = new ComImpl(); Comparator<Integer> methodRefCom =
		 * comp::compare;
		 */

		ComImplEmp compEmp = new ComImplEmp();
		Comparator<Emp> methodRefComEmp = compEmp::compare;

		// Collections.sort(list, namedClassCom);
		// Collections.sort(list, anonCom);
		// Collections.sort(list, lambdaCom);
		// Collections.sort(list, methodRefCom);

		// Collections.sort(empList, namedClassComEmp);
		// Collections.sort(empList, anonComEmp);
		// Collections.sort(empList, lambdaComEmp);
		Collections.sort(empList, methodRefComEmp);

		// Collections.reverse(list);

		// list.forEach(System.out::println);
		empList.forEach(System.out::println);

	}

}
