package phase1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEg {
	public static void main(String args[]) {
		Map<Integer, String> mp = new TreeMap<Integer, String>();

		mp.put(15, "public");
		mp.put(11, "main");
		mp.put(14, "MyClass");
		mp.put(13, "static");
		mp.put(12, "println");
		mp.put(16, "System");
		mp.put(10, "Hello");
		mp.put(10, "Hi");

		System.out.println(mp.get(6));

		Set s = mp.entrySet();

		Iterator it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
