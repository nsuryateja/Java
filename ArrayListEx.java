package dsjava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<Emp> ls =  new ArrayList<Emp>(); 
		
		ls.add(new Emp("Surya","Teja",394903));
		ls.add(new Emp("Sunny","N",396464));
		ls.add(new Emp("Swetha","Secrets",39653));
		ls.add(new Emp("Pawwrrii","N",374334));
		
		ls.forEach(emp -> System.out.println(emp));
		
		Emp e = new Emp("Surya","Teja",394903);
		
		System.out.println("***********");
		
		Emp[] arr = new Emp[ls.size()];

		ls.toArray(arr);
		
		for(Emp ar : arr) {
			System.out.println(ar);
		}
		
		
	

	}



}
