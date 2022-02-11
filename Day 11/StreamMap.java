package Day11;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		List<String> Names = new ArrayList<>();
		Names.add("Aaa");
		Names.add("bb");
		Names.add("Aman");
		Names.add("Rahul");
		Names.add("Sham");
		Names.add("Sun");
		Names.add("Yana");
		Names.add("Lokesh");
		
		Names.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

	}

}
