package CollectionPrgs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String args[]) throws IOException {

		FileReader fr = new FileReader("File.txt");
		FileWriter fw = new FileWriter("outputFile.txt");

		int n;

		while ((n = fr.read()) != -1) {

			fw.write(n);

		}

		fr.close();
		fw.close();
		System.out.println("Succefully completed");

	}
}