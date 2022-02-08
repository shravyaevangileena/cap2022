import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapQ2 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("apple",1);
		m.put("ball", 2);
		m.put("cat", 3);
		m.put("dog",4);
		Set set = m.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) itr.next();
			System.out.println(" Key:  " + entry.getKey() + " value:  " + entry.getValue());

	}
		System.out.println(m.containsKey("ball"));
		System.out.println(m.containsValue(7));

}
}
