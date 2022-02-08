package Day7;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPrg {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("mango");
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
