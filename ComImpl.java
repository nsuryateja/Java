package interfaces;

import java.util.Comparator;

public class ComImpl implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2) {
			return 1;
		}
		return -1;
	}

}
