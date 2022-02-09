package CollectionPrgs;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmap {

	public static void main(String ar[]) {

		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();

		m.put(1, "aa");
		m.put(2, "bb");
		m.put(3, "gg");
		m.put(4, "rr");
		m.putIfAbsent(3, "mynameadded");

		System.out.println(m);

	}

}