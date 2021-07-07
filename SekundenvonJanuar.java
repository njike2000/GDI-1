import java.util.Scanner;

public class SekundenvonJanuar {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        // wie viel sekunden gibt es im Januar

        int tage = 0, stunden = 0, minuten = 0, sekunden = 0, total = 0;

        System.out.println("Enter the number of days:");
        tage = sc.nextInt();

        System.out.println("Enter the number of hours:");
        stunden = sc.nextInt();

        System.out.println("Enter the number of minutes:");
        minuten = sc.nextInt();

        System.out.println("Enter the number of seconds:");
        sekunden = sc.nextInt();
        sc.close();

        total += (tage * 86400);
        total += (stunden * 3600);
        total += (minuten * 60);
        total += sekunden;
        System.out.println("The amount in seconds is" + total);

    }

}
