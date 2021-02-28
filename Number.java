package dsjava;

public class Number {

	public static void main(String[] args) {

		int N = 90;
		System.out.println(binaryGap(N));

	}

	public static int binaryGap(int N) {

		String s = Integer.toBinaryString(N);

		System.out.println(s);

		int start = 0;
		int count, temp = 0;
		while (start < s.length()) { // 0<7...
			count = 0;
			int j = start + 1;// 1...
			if (s.charAt(start) == '1') {// f
				while (s.charAt(j) != '1') {
					count++;
					j++;
				}
			}
			start = j - 1;
			if (count > temp)
				temp = count;
		}
		return temp;
	}

}
