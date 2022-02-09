package CollectionPrgs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Bufferedinputstream {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("File.txt");

		BufferedInputStream bis = new BufferedInputStream(fis);

		int i = fis.read();

		while (i != -1) {
			System.out.print((char) i);

			i = fis.read();
		}
		fis.close();
	}

}
