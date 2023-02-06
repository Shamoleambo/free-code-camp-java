package tutorial;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 1, 1, 5 };

		// The last argument is non inclusive
		Arrays.sort(arr, 0, arr.length);

		for (int element : arr) {
			System.out.println(element);
		}
	}
}
