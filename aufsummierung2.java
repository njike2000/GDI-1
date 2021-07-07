import java.util.Scanner;

public class aufsummierung2 {

    public static void main(String[] arg) {
        /*
         * Scanner sc = new Scanner(System.in); double q = 0.1; double m = 0; for (int i
         * = 15; i > -1; i--) { m += Math.pow(q, i); } System.out.println("antwort = " +
         * m);
         */
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y < 2; y--) {
                if (x == 1)
                    x++;
                System.out.println(x + " " + y);
            }
        }
    }
}
