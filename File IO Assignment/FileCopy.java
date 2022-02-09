package CollectionPrgs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input file name : ");
		String inputf = sc.nextLine();
		System.out.println("Output file name : ");
		String outputf = sc.nextLine();
		File filein = new File(inputf);
		File fileout = new File(outputf);
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		int n;
		while ((n= br.read()) != -1) {
			bw.write(n);
		}
		br.close();
		bw.close();
		sc.close();
	}
}