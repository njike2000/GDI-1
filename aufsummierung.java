import java.util.Scanner;

public class aufsummierung {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double q = 0.1;
        double m = 0;
        for (int i = 0; i < 16; i++) {
            m += Math.pow(q, i);
        }
        System.out.println("antwort = " + m);
        sc.close();
    }

}
