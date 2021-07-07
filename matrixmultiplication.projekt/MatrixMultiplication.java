package matrixmultiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixMultiplication {
    public static void main(String[] args) throws IOException {
        // BufferedReader to read text from character-InputStream and to buferring
        // characters to provide efficient reading of characters
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp;
        System.out.println("Geben Sie Zeilen in Matrix 1 >> ");
        // Reading the user input and copy into temp
        temp = br.readLine();

        // Assigning the value of temp to integer variable M1Row (After parsing string
        // as signed decimal integer)
        int M1Row = Integer.parseInt(temp);

        System.out.println("Insert columns in Matrix 1 >> ");
        temp = br.readLine();
        int M1Col = Integer.parseInt(temp);
        System.out.println("Insert rows in Matrix 2 >> ");
        temp = br.readLine();
        int M2Row = Integer.parseInt(temp);
        System.out.println("Insert columns in Matrix 2 >> ");
        temp = br.readLine();
        int M2Col = Integer.parseInt(temp);

        // Checking whether the multiplication is applicable
        if (M1Col == M2Row) {
            // Creating and initializing arrays to hold matrices
            int[][] Matrix1 = new int[M1Row][M1Col];
            int[][] Matrix2 = new int[M2Row][M2Col];
            int[][] Matrix3 = new int[M1Row][M2Col];

            // Inserting values in Martix1
            System.out.println("Insert values in Matrix1:");
            for (int i = 0; i < M1Row; i++) {
                for (int j = 0; j < M1Col; j++) {
                    temp = br.readLine();
                    Matrix1[i][j] = Integer.parseInt(temp);
                }
            }
            // Inserting values in Martix2
            System.out.println("Insert values in Matrix2:");
            for (int i = 0; i < M2Row; i++) {
                for (int j = 0; j < M2Col; j++) {
                    temp = br.readLine();
                    Matrix2[i][j] = Integer.parseInt(temp);
                }
            }

            // Multiplying two matrices
            System.out.println("Multiplying...");
            int temp1 = 0;
            for (int i = 0; i < M1Row; i++) {
                for (int j = 0; j < M2Col; j++) {
                    for (int k = 0; k < M2Row; k++) {
                        temp1 = temp1 + Matrix1[i][k] * Matrix2[k][j];
                    }
                    // Inserting elements in result matrix
                    Matrix3[i][j] = temp1;
                    temp1 = 0;
                }
            }

            // Display result of Multiplication
            System.out.println("Multiplication Completed!");
            System.out.println("............................................");
            System.out.println("Result");
            for (int i = 0; i < M1Row; i++) {
                for (int j = 0; j < M2Col; j++) {
                    System.out.print(Matrix3[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("............................................");
        } else {
            System.out.println("Multiplication could not be done!");
            System.out.println(
                    "Tip: Number of columns in a matrix1 should be equal to number of rows in matrix2 to perform multiplication.");
        }
    }

}