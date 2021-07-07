import java.util.Scanner;

public class quadratisch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double EPSILON = 1E-15;

        System.out.println("Eingabe Koefficient x^2: ");
        double a = sc.nextDouble();

        System.out.println("Eingabe Koefficient x: ");
        double b = sc.nextDouble();

        System.out.println("Eingabe Kostant: ");
        double c = sc.nextDouble();
        sc.close();

        double D = (b * b) - (4 * a * c);

        if (D > 0.0) {
            double x1 = ((b * -1) + (Math.sqrt(D))) / (2 * a);
            double x2 = ((b * -1) - (Math.sqrt(D))) / (2 * a);
            System.out.println("Die Antworte sind : " + x1 + " und " + x2);
        } else if (Math.abs(D) < EPSILON) {
            double x1 = ((b * -1) + (Math.sqrt(D))) / (2 * a);
            System.out.println("Antwort : " + x1);
        } else {
            System.out.println("Es gibt keine Antwort");
        }

    }

}
