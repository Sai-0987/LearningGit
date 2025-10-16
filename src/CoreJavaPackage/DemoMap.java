package CoreJavaPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		Map<Integer, String> p = new HashMap<>();
		p.put(1, "ind");
		p.put(2, "uk");
		p.put(3, "Us");
		p.put(4, "Rushia");
		p.put(5, "United");

		System.out.println(p);

		Set<Entry<Integer, String>> entrySet = p.entrySet();
		for (Entry<Integer, String> m : entrySet) {
			System.out.println(m.getKey() + "--" + m.getValue());

		}

		Set<Integer> keySet = p.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}

		Collection<String> values = p.values();
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		boolean empty = p.isEmpty();
		System.out.println(empty);

	}
}
