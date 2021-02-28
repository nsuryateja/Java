package sols;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

	public static void main(String[] args) {

		BigDecimal bd1 = new BigDecimal("13738221.0987654321");
		BigDecimal bd2 = new BigDecimal("18377272.123456789");
		BigDecimal bd3 = new BigDecimal("371372722.0987654321");
		BigDecimal bd4 = new BigDecimal("-355654321.123456789");
		BigDecimal bd5 = new BigDecimal("-124567890.0987654321");
		BigDecimal bd6 = new BigDecimal("987765321.123456789");
		BigDecimal bd7 = new BigDecimal("107674321.123456789");
		BigDecimal bd8 = new BigDecimal("117765321.123456789");
		BigDecimal bd9 = new BigDecimal("127674321.123456789");
		BigDecimal bd10 = new BigDecimal("137765321.123456789");
		BigDecimal bd11 = new BigDecimal("147674321.123456789");
		BigDecimal bd12 = new BigDecimal("157765321.123456789");
		BigDecimal bd13 = new BigDecimal("167674321.123456789");
		BigDecimal bd14 = new BigDecimal("177765321.123456789");
		BigDecimal bd15 = new BigDecimal("187674321.123456789");
		BigDecimal bd16 = new BigDecimal("197765321.123456789");
		BigDecimal bd17 = new BigDecimal("207674321.123456789");

		List<BigDecimal> sbd = Arrays.asList(bd1, bd2, bd3, null, bd4, bd5, bd6, bd7, bd8, bd9, bd10, bd11, bd12, bd13,
				bd14, bd15, bd16, bd17);

		logic(sbd);

	}

	public static Stream<BigDecimal> logic(List<BigDecimal> sbd) {

		List<BigDecimal> nonulls = sbd.stream().filter(x -> (x != null && x.compareTo(BigDecimal.ZERO) > 0))
				.collect(Collectors.toList());

		for (BigDecimal lst : nonulls) {
			System.out.println(lst);
		}

		System.out.println();

		List<ArrayList<BigDecimal>> tripleList = new ArrayList<ArrayList<BigDecimal>>();

		try {
			for (int i = 0; i < nonulls.size(); i += 3) {
				List<BigDecimal> helper = new ArrayList<BigDecimal>();
				helper.add(nonulls.get(i));
				helper.add(nonulls.get(i + 1));
				helper.add(nonulls.get(i + 2));
				tripleList.add((ArrayList<BigDecimal>) helper);
			}
		} catch (IndexOutOfBoundsException e) {

		}

		for (ArrayList<BigDecimal> lst : tripleList) {
			System.out.println(lst);
		}

		System.out.println();

		List<ArrayList<BigDecimal>> listOfTriplesAvgGreaterThan30 = tripleList.stream().filter(Task3::avg)
				.collect(Collectors.toList());

		for (ArrayList<BigDecimal> lst : listOfTriplesAvgGreaterThan30) {
			System.out.println(lst);
		}

		System.out.println(listOfTriplesAvgGreaterThan30.isEmpty());

		List<BigDecimal> flatList = listOfTriplesAvgGreaterThan30.stream().flatMap(List::stream)
				.collect(Collectors.toList());

		return flatList.stream().flatMap(SampleNormalizer::normalize).collect(Collectors.toList());

	}

	public static boolean avg(List<BigDecimal> nums) {
		BigDecimal sum = nums.get(0).add(nums.get(1)).add(nums.get(2));

		BigDecimal div = new BigDecimal("3");

		sum = sum.divide(div, 2, RoundingMode.HALF_UP);

		BigDecimal temp = new BigDecimal("30");

		return sum.compareTo(temp) > 0;
	}
}
