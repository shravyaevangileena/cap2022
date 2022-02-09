package CollectionPrgs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Bufferedoutputstream {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("File.txt");

		FileOutputStream fos = new FileOutputStream("outputFile.txt");

		int i;

		while ((i = is.read()) != -1) {

			fos.write(i);

		}

		is.close();
		System.out.println("Succesfully completed");

	}

}