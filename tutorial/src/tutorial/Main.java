package tutorial;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map starman = new HashMap();
		starman.put("name", "Starman Top G");
		starman.put("age", 123);
		starman.put("address", "The Moon");
		starman.put("id", 123412);

		System.out.println(starman.containsKey(123));
		System.out.println(starman.containsValue(123));

		System.out.println(starman);
		System.out.println(starman.isEmpty());

		starman.clear();
		System.out.println(starman);
		System.out.println(starman.isEmpty());
	}
}
