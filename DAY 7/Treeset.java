package Day7;

import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String ar[]) {

		Set<String> treesetdemo = new TreeSet<String>();

		treesetdemo.add("apple");
		treesetdemo.add("mango");

		treesetdemo.add("nuts");
		treesetdemo.add("apple");
		treesetdemo.add("apple");
		treesetdemo.add("apple");
		treesetdemo.add("apple");
		treesetdemo.add("banana");

		treesetdemo.add(null);

		Iterator iterator = treesetdemo.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());

			}

		}

	}

}
