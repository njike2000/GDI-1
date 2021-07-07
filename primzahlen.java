import java.util.Scanner;

public class primzahlen {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = 0, x = 0;
        System.out.println("Schreiben Sie ein Zahl");
        n = sc.nextInt();
        sc.close();
        for (int m = 2; m <= n; m++) {
            if (n % m == 0) {
                x++;
            }
            if (x >= 2)
                System.out.println(+n + " ist kein primzahl");

            else
                System.out.println(+n + " = ein primzahl");

        }
    }

}
