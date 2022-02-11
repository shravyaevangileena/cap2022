package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorsList {

	public static void main(String[] args) {
	//Stream elements to List
	List<Integer>l=new ArrayList<Integer>();
	for(int i=1;i< 10;i++) {
		l.add(i);
	}
	Stream<Integer>stream=l.stream();
	List<Integer>evennum=stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(evennum);
	}

}
