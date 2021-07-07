import java.util.Scanner;

public class funktion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Geben sie eine Zahl");
        a = sc.nextInt();
        System.out.println("int: " + a);
        sc.close();
        int result = functmod3(a);
        System.out.printf("%d%n", result);
    }

    static int functmod3(int n) {
        int r = n % 3;
        r = n - n / 3 * 3;

        return r;
    }

}
