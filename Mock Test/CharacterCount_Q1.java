import java.util.Scanner;

public class CharacterCount_Q1 {

	public static void main(String[] args) {

		String str;
		char ch;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		str = sc.next();
		System.out.println("Enter character");
		ch = sc.next().charAt(0);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);

	}

}
