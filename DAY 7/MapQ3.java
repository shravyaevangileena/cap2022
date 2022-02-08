import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapQ3 {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap();
		m.put("Telangana","Hyderabad");
		m.put("Andhra Pradesh", "Amaravathi");
		m.put("Maharastra","Mumbai");
		m.put("Madhya Pradesh","Bhopal");
		Set set = m.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<String, String> entry = (Map.Entry<String, String>) itr.next();
			System.out.println(" State: " + entry.getKey() + "    Capital: " + entry.getValue());


	}

}
}
