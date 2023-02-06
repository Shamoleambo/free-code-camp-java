package tutorial;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(8);

		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(3));

		System.out.println(arrayList.size());
		arrayList.set(4, 123);
//		arrayList.set(6, 13); ==> Not possible, the index must be initialized in order to use set function
		System.out.println(arrayList);

		System.out.println(arrayList.isEmpty());

		// Last paramather is non inclusive
		System.out.println(arrayList.subList(0, 3));

		arrayList.clear();
		System.out.println(arrayList);
	}
}
