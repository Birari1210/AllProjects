package java8Assingment;

import java.util.ArrayList;
import java.util.List;

public class MaximumNoAss_12 {

	interface Maximum {
		void maxArray(int a[]);

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		Maximum u = (int a[]) -> {
			for (int i = 1; i < a.length; i++) {
				list.add(a[i]);
			}
			Integer max = list.stream().max((e1, e2) -> e1 > e2 ? 1 : -1).get();
			System.out.println("Maximum number in array =" + max);
		};
		u.maxArray(new int[] { 76, 89, 87, 40, 90 });
	}

}
