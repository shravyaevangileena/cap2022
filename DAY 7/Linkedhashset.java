package Day7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String ar[]) {

		LinkedHashSet<String> linkedHashSettdemo = new LinkedHashSet<String>();

		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("mango");
		linkedHashSettdemo.add("banana");
		linkedHashSettdemo.add("nuts");
		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("apple");
		linkedHashSettdemo.add("apple");

		linkedHashSettdemo.add(null);
		linkedHashSettdemo.add(null);

		linkedHashSettdemo.add(null);

		Iterator iterator = linkedHashSettdemo.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());

			}

		}

	}

}