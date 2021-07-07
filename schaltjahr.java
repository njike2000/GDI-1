import java.util.Scanner;

public class schaltjahr {
    public static void main(String[] arg) {
        final double EPSILON = 1E-15;
        Scanner sc = new Scanner(System.in);
        /* Ein Schaltjahr existiert wenn das Jahr ab 1582 */
        System.out.println("Geben Sie ein Jahr ein: ");
        int n = sc.nextInt();
        if (n > 1582) {
            if (Math.abs(n) % 100 < EPSILON && Math.abs(n) % 4 < EPSILON && Math.abs(n) % 400 < EPSILON) {
                System.out.println("Das Jahr ist ein SchaltJahr");
            } else {
                System.out.println("Das Jahr ist kein SchaltJahr");
            }
        } else {
            System.out.println("Das Jahr ist falsch eingegeben");
        }
        sc.close();
    }

}
