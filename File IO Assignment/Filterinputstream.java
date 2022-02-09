package CollectionPrgs;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Filterinputstream {

	public static void main(String[] args) throws IOException {
		File f = new File("File.txt");
		FileInputStream fis = new FileInputStream(f);
		FilterInputStream filter = new BufferedInputStream(fis);
		int n = 0;
		while ((n = filter.read()) != -1) {
			System.out.print((char) n);
		}
		fis.close();
		filter.close();
	}
}