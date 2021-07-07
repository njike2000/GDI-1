import java.util.Scanner;

public class dezimal {

    static void printDual(int n) {
        int r;
        if (n == 0) {
            System.out.printf("%d%n:", 0);
        }
        while (n != 0) {
            r = n % 2;
            n = n / 2;
            System.out.printf("%d%n: ", r);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z;
        System.out.println("Geben sie eine Zahl ein: ");
        z = sc.nextInt();
        System.out.println("int z: " + z);
        sc.close();
        printDual(z);

    }

}
