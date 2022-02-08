import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListQ3 {

	public static void main(String[] args) {
		List<String> l=new ArrayList();
		l.add("apple");
		l.add("Elephant");
		l.add("cat");
		l.add("ball");
		l.add("dog");
		System.out.println(l);
		printAll(l);
	}
		
	public static void printAll(List<String> l) {
			Iterator<String> itr=l.iterator();
			while(itr.hasNext()) {
				String str=itr.next();
				System.out.println(str);
		}

	}

}
