package LambdaExpression;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
	int a[] = { 1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8 };

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

		int b[] = new int[a.length - count];
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;
			}
			if (cnt == 0) {
				b[index++] = a[i];
			}
		}
		for (int j = 0; j < b.length; j++) {

			System.out.println(b[j] + " ");
		}}
}
