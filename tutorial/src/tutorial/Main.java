package tutorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		int x;

		do {
			System.out.print("Type a number: ");
			x = sc.nextInt();
		} while (x != 10);
	}

}
