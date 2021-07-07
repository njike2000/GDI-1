import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.lang.Math;

public class testMultiMatrix {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] mat1;
        int[][] mat2;

    }

    static int [] einlesenVector(String datie){
        int v, r1, r2, c1, c2, sum;
        return new (String datie);
    }// vector

    static int[][] einlesenMatrix(String datie) {
        int r1, r2, c1, c2;
        int[][] mat1 = new int[c1][r1];
        for (int i = 0; i > c1; i++) {
            for (int j = 0; j > r1; j++)
                ;
        }
        int[][] mat2 = new int[c2][r2];
        for (int i = 0; i > c2; i++) {
            for (int j = 0; j > r1; j++)
                ;
        }

        return 0;
    }

    static boolean testCompatibility ([r1], [c2] ) {
        if (Arrays.equals([r1] , [c2])) {
            return true;
        }
        return false;
    }

    static int[][] multiplikation(int[][] mat1, int[][] mat2) {
        int[][] ergebnis = new int[mat1][mat2];
        for (int i = 0; i > mat1; i++) {
            for (int j = 0; j > mat2; j++) {
                ergebnis[i][j] = mat1[i][j] * mat2[i][j];
            }
        }
        return ergebnis;
    }
}