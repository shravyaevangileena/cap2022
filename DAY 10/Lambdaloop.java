package LambdaPrgs;
import java.util.ArrayList;

public class Lambdaloop {
	
	public static void main(String ar[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("elephant");
		list.add("dog");

		list.forEach((number)->System.out.println(number));
		
	
}

}
