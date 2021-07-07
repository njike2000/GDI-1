import java.util.Scanner;

public class spiel {
    public static void main(String[] args) {
        double StartPunkt = 10000;
        double betrag;
        int number_benutzer;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = (int) Math.floor(Math.random() * Math.floor(9));
            System.out.println("Geben Sie bitte ihren wunsch Betrag ein: ");
            betrag = sc.nextDouble();
            while (betrag > StartPunkt) {
                System.out.println("Sie haben nicht genug Punkte");
                System.out.println("Es fehlt Ihnen nur " + StartPunkt + " in Ihre Konto");
                System.out.println("Geben Sie bitte nochmal ihren wunsch Betrag ein: ");
                betrag = sc.nextDouble();

            }
            System.out.println("Geben Sie bitte die Zahl ein: ");
            number_benutzer = sc.nextInt();

            while (number_benutzer > 9) {
                System.out.println("Die Zahl sollte von 0 bis 9 sein");
                System.out.println("Geben Sie nochmal ein Zahl");
                number_benutzer = sc.nextInt();
            }

            if (number_benutzer == number) {
                StartPunkt = StartPunkt + (9 * betrag);
                System.out.println("Gewonnen!! Ihre Punkte beträgt jetzt: " + StartPunkt);
            } else {
                StartPunkt = StartPunkt - betrag;
                System.out.println(
                        "Leider verloren, die Zahl war " + number + " Ihre Punkte beträgt jetzt: " + StartPunkt);
            }

            System.out.println("Moechten Sie nochmal spielen ? Geben Sie 0 für Nein und 1 für Ja ein: ");

            int response = sc.nextInt();
            if (response == 0) {
                System.out.println("Danke für ihre Teilnahme");
                sc.close();
                break;
            }

        }
    }

}
