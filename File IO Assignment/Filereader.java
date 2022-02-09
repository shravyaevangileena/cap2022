package CollectionPrgs;

import java.io.FileReader;
import java.io.IOException;

class Filereader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file.txt");
		int n;

		while ((n = fr.read()) != -1) {

			System.out.println((char) n);

		}

		fr.close();

	}

}