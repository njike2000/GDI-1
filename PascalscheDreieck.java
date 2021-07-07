import java.util.Scanner;

public class PascalscheDreieck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        while (n > 9) {
            System.out.println("Geben Sie eine Zahl weniger als 10 ein: ");
            n = in.nextInt();
        }
        in.close();

        String separator = " ";
        for (int zeile = 0; zeile <= n; ++zeile) {
            for (int space = n - zeile; space > 0; --space) {
                System.out.print(separator);
            }
            for (int k = 0; k <= zeile; ++k) {
                System.out.print(pascal(zeile, k));
                if (k < zeile) {
                    System.out.print(separator);
                }
            }
            System.out.println();
        }
    }

    public static long pascal(int n, int k) {
        if (k == 0) {
            return 1;
        }
        if (k == n) {
            return 1;
        }
        return pascal(n - 1, k - 1) + pascal(n - 1, k);
    }
}
