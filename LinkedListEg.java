package phase1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedListEg {
	public static void main(String args[]) {
		List<String> mp = new LinkedList<String>();

		mp.add("public");
		mp.add("main");
		mp.add("MyClass");
		mp.add("static");
		mp.add("println");
		mp.add("System");
		mp.add("Hello");
		mp.add("Hi");
		mp.add("Hi");

		System.out.println(mp.get(3)); // index 3 so static
		
		mp.add(3,"Surya"); // change index 3 element to surya, static will be at 4
		
		System.out.println(mp.get(4));
		
		mp.set(4, "Not Static");
		
		System.out.println(mp.get(4));
		
		Iterator it = mp.iterator();

		while (it.hasNext()) {
		System.out.println(it.next());
		}

	}
}
