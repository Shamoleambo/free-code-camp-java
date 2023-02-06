package tutorial;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// LinkedHashMaps care about the order
		// Doesn't care if the types of the keys are the same
		Map m = new LinkedHashMap<>();
		m.put("mano", "top G");
		m.put(3, 2);
		m.put("tiu", 3);
		m.put("fulano", "putinha");

		System.out.println(m);
	}
}
