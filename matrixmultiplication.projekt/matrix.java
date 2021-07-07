package matrixmultiplication;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class matrix2 {
	static int[] einlesenVector(String datie) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		System.out.println("Geben Sie Zeilen in Matrix 1 >> ");
		// Reading the user input and copy into temp
		temp = br.readLine();
		int M1Row = Integer.parseInt(temp);

		System.out.println("Insert columns in Matrix 1 >> ");
		temp = br.readLine();
		int M1Col = Integer.parseInt(temp);
		int[] vector = new int[M1Row];

		return vector;

	}

	static int[][] einlesenMatrix(String datie) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		System.out.println("Insert rows in Matrix 2 >> ");
		temp = br.readLine();
		int M2Row = Integer.parseInt(temp);
		System.out.println("Insert columns in Matrix 2 >> ");
		temp = br.readLine();
		int M2Col = Integer.parseInt(temp);

	}
}
