package com;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {

		List<Emp> ls = new ArrayList<Emp>();

		addEmp(ls, new Emp("Surya", 32090, 394903));
		addEmp(ls, new Emp("Sunny", 76433, 396464));
		addEmp(ls, new Emp("Swetha", 54666, 39653));
		addEmp(ls, new Emp("Pawan", 65774, 374334));

		System.out.println("Added Emp objects:\n" + listAll(ls));

		deleteEmp(ls, ls.get((0)));

		System.out.println("\nEmp objects after deletion:\n" + listAll(ls));

	}

	public static boolean addEmp(List<Emp> ls, Emp e) {
		try {
			ls.add(e);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static boolean deleteEmp(List<Emp> ls, Emp e) {
		try {
			ls.remove(e);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static List<Emp> listAll(List<Emp> ls) {

		List<Emp> xs = new ArrayList<Emp>();

		for (Emp e : ls) {
			xs.add(e);
		}
		return xs;
	}
}
