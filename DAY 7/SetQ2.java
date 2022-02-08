import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetQ2 {

	public static void main(String[] args) {
		Set<String> s=new HashSet();
		s.add("John");
		s.add("Peter");
		s.add("Andrew");
		s.add("Thomas");
		s.add("Joseph");
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}
		

	}

}
