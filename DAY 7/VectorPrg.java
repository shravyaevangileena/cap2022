package Day7;

import java.util.Vector;

public class VectorPrg {
	public static void main(String ar[]) {

		
		Vector<String> vec = new Vector<String>();
		
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");

		System.out.println("Elements are: " + vec);
		System.out.println("Elements are: " + vec.size());

	}

}
