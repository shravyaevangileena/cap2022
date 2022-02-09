package CollectionPrgs;

import java.io.*;

public class Filteroutputstream {

	public static void main(String[] args) throws IOException {

		File f = new File("file1.txt");
		FileOutputStream fos = new FileOutputStream(f);
		FilterOutputStream filter = new FilterOutputStream(fos);
		String s = "Welcome to java programming";
		byte b[] = s.getBytes();
		filter.write(b);
		filter.flush();
		filter.close();
		fos.close();
		System.out.println("Successfully completed");
	}
}
