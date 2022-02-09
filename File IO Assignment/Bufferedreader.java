package CollectionPrgs;

import java.io.*;

public class Bufferedreader {

	public static void main(String args[]) throws Exception {

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.println("your name: ");

		String name = br.readLine();

		System.out.println("hi " + name);
	}
}