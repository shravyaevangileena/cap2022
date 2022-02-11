package Day11;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamArray {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<Integer>();
		for(int i=1;i< 10;i++) {
			l.add(i);
		}
		Stream<Integer>stream=l.stream();
		Integer[] evenArray=stream.filter(i->i%2==0).toArray(Integer[]::new);
		System.out.println(evenArray);

	}

}
