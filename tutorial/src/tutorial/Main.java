package tutorial;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// HashMap doesn't retain the order;
		// Cannot have two of the same keys, but you can have two of the same values;
		// It is a very fast data set because doesn't care about order
		Map m = new HashMap();
		m.put("mano", "top G");
		m.put("truta", 2);
		m.put("tiu", 3);
		m.put("fulano", "putinha");

		System.out.println(m);
	}
}
