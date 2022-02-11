package Day11;

import java.util.stream.Stream;

public class StreamPrg {
	public static void  main(String ar[]) {
		
	Stream.iterate(1,element ->element+1).filter(element ->element % 5==0).limit(3).forEach(System.out::println); // **Functional style programming**
		
	}

}

