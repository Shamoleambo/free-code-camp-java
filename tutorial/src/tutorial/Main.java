package tutorial;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// A set cannot contain the same element twice
		Set<Integer> t = new HashSet<Integer>();
		t.add(1);
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(8);
		t.add(9);

		System.out.println(t);
		System.out.printf("The size of the set t is: %d%n", t.size());
		System.out.println(t.contains(5));
		System.out.println(t.contains(4));

		t.remove(9);
		System.out.println(t);

		t.clear();
		System.out.println(t);

		System.out.println(t.isEmpty());
		System.out.printf("The size of the set t now is: %d%n", t.size());
	}
}
