import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestWord {
	public static String LongestWord(String sen) {
		
		String newSen = sen.replaceAll("[^a-zA-Z0-9]"," ");
		return Arrays.stream(newSen.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String word = LargestWord.LongestWord(sc.nextLine());
		System.out.println("The longest word is "+ word);
	
		sc.close();


	}

}

