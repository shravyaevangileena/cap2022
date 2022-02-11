package Day11;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

	
	public static void main(String[] args) {
		List<String> Names = new ArrayList<>();
		Names.add("Apple");
		Names.add("ball");
		Names.add("Aman");
		Names.add("Rahul");
		Names.add("Sham");
		Names.add("Sun");
		Names.add("moon");
		Names.add("stars");
		
		Names.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

	}

}
