package tutorial;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TreeMaps must have the same type for the keys
		Map m = new TreeMap();
		m.put("mano", "top G");
		m.put("truta", 2);
		m.put("tiu", 3);
		m.put("fulano", "putinha");

		System.out.println(m);
	}
}
