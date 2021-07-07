import java.util.Arrays;

/*public class WasWohlTest {
    private static void waswohl(int b, int n) {
        if (n >= b)
            waswohl(b, n / b);
        System.out.print(n % b);
    } // waswohl

    public static void main(String[] args) {
        waswohl(2, 19);
        System.out.printf("\n");
        waswohl(3, 28);
        System.out.printf("\n");
        waswohl(8, 71);
        System.out.printf("\n");
    } // main
}// WasWohlTest*/
class WasWohl {
    public static void main(String[] args) {
        int[] n = { 1, 2, 3 };
        int[] m = { 4, 5, 6 };
        int b = n.length + m.length;
        int[] ans = new int[b];
        int pos = 0;
        for (int elmt : n) {
            ans[pos] = elmt;
            pos++;
        }
        for (int elmt : m) {
            ans[pos] = elmt;
            pos++;
        }
        System.out.println(Arrays.toString(ans));
    }

} // WasW m ohl