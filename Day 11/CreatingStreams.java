package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {

		// using Stream.of()
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		// Using Stream.of(array)
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream1.forEach(p -> System.out.println(p));

		// Using List.stream()
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(p -> System.out.println(p));

		// Using Stream.generate() Stream.iterate
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);

		// Using Stream of String chars or tokens
		IntStream stream3 = "12345_abcdefg".chars();
		stream3.forEach(p -> System.out.println(p));
		Stream<String> stream4 = Stream.of("A$B$C".split("\\$"));
		stream4.forEach(p -> System.out.println(p));

	}

}
