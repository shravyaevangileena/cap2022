package CollectionPrgs;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePrg {

	public static void main(String ar[]) {

		Queue<String> lines = new PriorityQueue<String>();

		lines.add("John");
		lines.add("sam");
		lines.add("Joseph");
		lines.add("David");

		Iterator itr = lines.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
	}

}