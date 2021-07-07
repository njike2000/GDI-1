import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrix2 {
	private static final int M1Row = 0;
	private static final int M2Col = 0;
	private static final int M2Row = 0;
	private static final int[][] Matrix3 = null;
	static int i;
	static int j;

	static int[] einlesenVector(String datie) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		System.out.println("Geben Sie Zeilen in Matrix 1 >> ");
		// Reading the user input and copy into temp
		temp = br.readLine();
		int M1Col = Integer.parseInt(temp);
		int[] vector = new int[M1Col];

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
		int[][] Matrix = new int[M2Row][M2Col];
		return Matrix;
	}

	static boolean testCompatibility(int[] vector, int[][] Matrix) {
		int M1Col;
		if (M1Col == M2Row) {
			return true;

			System.out.println("Multiplication could not be done!");
			System.out.println(
					"Tip: Number of columns in a matrix1 should be equal to number of rows in matrix2 to perform multiplication.");
		}
		return false;
	}

	static int multiplikation(int[] vector, int[][] Matrix) {
		System.out.println("Multiplying...");
		int temp1 = 0;
		for (int i = 0; i < M1Row; i++) {
			for (int j = 0; j < M2Row; j++) {
				for (int k = 0; k < M2Col; k++) {
					temp1 = temp1 + vector[i] * Matrix[k][j];
				}
				// Inserting elements in result matrix
				Matrix3[i][j] = temp1;
				temp1 = 0;
			}
		}
		return Matrix3[i][j];
	}

	static void auslesenVector(int[] vector, String ausDat) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < M1Row; i++) {
			for (int j = 0; j < M2Col; j++) {
				System.out.print(Matrix3[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("............................................");

	public static void main(String[] args) {
		// BufferedReader to read text from character-InputStream and to buferring
		// characters to provide efficient reading of characters
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;

		// Assigning the value of temp to integer variable M1Row (After parsing string
		// as signed decimal integer)

		System.out.println("Insert row in vector >> ");
		temp = br.readLine();
		int M1Row = Integer.parseInt(temp);
		System.out.println("Insert rows in Matrix >> ");
		temp = br.readLine();
		int M2Row = Integer.parseInt(temp);
		System.out.println("Insert columns in Matrix 2 >> ");
		temp = br.readLine();
		int M2Col = Integer.parseInt(temp);
		int[][] einlesenMatrix;
		int[] einlesenVector;
		int[] multiplikation;
		boolean testCompatibility;
		int[] vector = new int[M1Row];
		int[][] Matrix = new int[M2Row][M2Col];
		int[][] Matrix3 = new int[M1Row][M2Col];

		// Inserting values in Martix1
		System.out.println("Insert values in Vector:");
		int M1Col;
		for (int j = 0; j < M1Col; j++) {
			temp = br.readLine();
			vector[j] = Integer.parseInt(temp);
		}

		// Inserting values in Martix2
		System.out.println("Insert values in Matrix2:");
		for (int i = 0; i < M2Row; i++) {
			for (int j = 0; j < M2Col; j++) {
				temp = br.readLine();
				Matrix[i][j] = Integer.parseInt(temp);
			}
		}
		System.out.println("Multiplying...");
		int temp1 = 0;
	}

}
// e
