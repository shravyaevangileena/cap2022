package Day7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkedhashmap {
	public static void main(String args[]) {
		Map<Integer,String> m = new LinkedHashMap<Integer,String>();
		m.put(1,"Amar");
		m.put(2,"Akhbar");
		m.put(3,"Anthony");
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> e = (Map.Entry<Integer, String>) itr.next();
			System.out.println("Key---> "+e.getKey()+"   Value---> "+e.getValue());
		}
	}
}