package tutorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 5, 8, 13 };
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.print("Input: ");
			String nameInput = sc.nextLine();
			names[i] = nameInput;
		}

		for (String name : names) {
			System.out.println(name);
		}
	}

}
