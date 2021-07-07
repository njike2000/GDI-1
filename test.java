import java.util.Scanner;

public class test {
    public static void main(String[] arsg) {

        int gut = Wuerfel.gut();
        int falsche = Wuerfel.falsch();

    }

    /*
     * public static boolean istGleichVerteilt() { int n = Wuerfel.gut(); if (n !=
     * Wuerfel.gut()) { return true; } }
     */

}

class Wuerfel {

    public static void main(String[] arsg) {
        while (true) {
            System.out.println(gut());
            System.out.println(falsch());
        }
    }

    static int gut() {
        int Zahl = (int) Math.floor((Math.random() * (6) + 1));
        System.out.println("Die Zahl ist : " + Zahl);
        return Zahl;
    }

    static int falsch() {
        /*
         * Scanner sc = new Scanner(System.in); int Zahl1 = (int)
         * Math.floor(Math.random() * Math.floor(6));
         * System.out.println("Geben sie einZahl zwischen von 1 bis 6"); int Zahl2 =
         * sc.nextInt(); if (Zahl1 == Zahl2) { System.out.println(Zahl2); } else {
         * System.out.println("Falsch Die Zahl soll :" + Zahl1); }
         */
        return 5;
    }
}