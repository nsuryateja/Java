package sols;

public class Task1 {
	public static void main(String[] args) {
		System.out.println(logic("aabbb"));	
	}

public static boolean logic(String str) {

		int firstIndexOfb = str.indexOf("b");
		if (firstIndexOfb != -1) {
			String helperString = str.substring(firstIndexOfb);
			return !(helperString.contains("a"));
		} else {
			return true;
		}
	}
	}