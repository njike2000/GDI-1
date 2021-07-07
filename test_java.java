
/*class CastOp {
    public static void main(String[] args) {

        double x;
        int n = 5, m = 2;

        x = n / m;
        System.out.println("x: " + x);
        x = (double) n / m;
        System.out.println("x: " + x);
    } // main
} // class CastOp*/
/*class TestEuklid {
    public static void main(String[] args) {
        
         * int a = ggtEuklid.eingabeA(); int b = ggtEuklid.eingabeB(); int result =
         * ggtEuklid.ggT(a, b); ggtEuklid.ausgabe(result);
        
        int[] Zahl = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };

        for (int i = 0; i < Zahl.length; i++) {
            System.out.print((char) ('A' + Zahl[i]));
        }

    }
}*/
import java.util.Arrays;

class Aufgabe4a {
    static void print(int[] vektor) {
        for (int i = 0; i < vektor.length; i++)
            System.out.print(vektor[i] + " ");
        System.out.println();
    } // print

    public static void main(String[] args) {
        int[] v = { 3, 4, 5, 6 };
        int[][] m = new int[v.length][];
        for (int i = 0; i < m.length; i++)
            m[i] = new int[v[i]];
        m[0] = v;
        Arrays.fill(m[1], 10);
        Arrays.fill(m[2], 7);
        m[3][1] = m[1][1];
        m[3][2] = m[2][1];
        System.out.print("a: ");
        print(m[0]);
        System.out.print("b: ");
        print(m[1]);
        System.out.print("c: ");
        print(m[2]);
        System.out.print("d: ");
        print(m[3]);
    } // main
} // Aufgabe4a
