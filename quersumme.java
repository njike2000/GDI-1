import java.util.Arrays;

public class quersumme {
    /*
     * public static void main(String[] args) {
     * 
     * int querSumme = 0; int zahl = 123456789;
     * 
     * while (zahl > 0) { zahl = zahl / 10; int letztezahl = zahl % 10; querSumme +=
     * letztezahl; System.out.println("quersSumme ist : " + querSumme); }
     * 
     * }
     */

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
}
