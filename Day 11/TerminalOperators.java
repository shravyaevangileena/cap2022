package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperators {

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

		//Using Stream.forEach()
		Names.forEach(System.out::println);
		
		
		//Using Stream.collect
		List<String> memNamesInUppercase = Names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
		
		//Stream.count()
		long totalMatched = Names.stream() .filter((s) -> s.startsWith("A")).count(); 
		System.out.println(totalMatched); 
		
		
		//Using Stream.reduce()
		Optional<String> reduced = Names.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
		
		
		//Using Stream.match()
		boolean matchedResult = Names.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);    
		 
		matchedResult = Names.stream()
		        .allMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);   
		 
		matchedResult = Names.stream()
		        .noneMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult); 

	}

}
