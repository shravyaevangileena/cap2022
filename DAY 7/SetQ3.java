import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetQ3 {

	public static void main(String[] args) {
		Set<String> s= new TreeSet();
		s.add("apple");
		s.add("cat");
		s.add("ball");
		s.add("dog");
		ArrayList<String> l=new ArrayList(s);
		Collections.reverse(l);
		System.out.println(l);
		Iterator<String> itr =s.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
			
		}
	System.out.println(s.contains("Ball"));

	}

}
