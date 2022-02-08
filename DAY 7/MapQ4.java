import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapQ4 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("John",12345678);
		m.put("Andrew", 253647489);
		m.put("Peter", 34657848);
		m.put("David",474291048);
		Set set = m.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) itr.next();
			System.out.println("Name:  " + entry.getKey() + "            Contact Number:  " + entry.getValue());

	}
		System.out.println(m.containsKey("Joseph"));
		System.out.println(m.containsValue(474291048));

}
}