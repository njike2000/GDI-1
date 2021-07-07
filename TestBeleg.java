/*class helloworld {

    // public static void main (String args[]){
    // Ausgabe von Hello World
    // System.out.println ("Hello World!");
    static void helloSagen(int inWert) {
        System.out.println("Hallo World!" + inWert);
    }

    public static void main(String[] args) {

        helloSagen(42);
    }

    // static void printHello (int n){
    // System.out.println("ich wäre gern " + n + "Jahre alt");
    // }
    // public static void mian(String []args){
    // int n = 30;
    // printHello();
    // }
}*/

/*class TestPackage {
    public static void main(String[] args) {
        Packages.PackageHello.displayHello();
    }

}*/
/*import java.io.*;

class TestEinData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Daten.dat");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());
        dis.close();

    }
}*/
/*class WasWohl {
    public static String methode(String s, int n) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++)
            ca[i] += n;
        return new String(ca);
    } // methode

    public static void main(String[] args) {
        System.out.println(methode("HAL", 1));
    } // main
} // WasWohl*/
/*public class TestLotto {
    public static int lottozahl() {
        int zahl = (int) Math.floor(Math.random() * 49 + 1);
        return zahl;
    } // lottozahl

    public static int[] lottozahlen() {

        int[] arr = new int[6];
        for (int nextfree = 0; nextfree < 6; nextfree++) {
            arr[nextfree] = lottozahl();
        }
        return arr;
    } // lottozahlen

    public static void printLottozahlen(int[] result) {
        System.out.println("Die aktuellen Lottozahlen lauten: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(result[i] + " ");
        }
    } // printLottozahlen

    public static void main(String args[]) {
        printLottozahlen(lottozahlen());
    } // main
} // TestLotto*/
class Beleg {
    private static int anzahlBelege = 100;
    private int belegNummer = 0;

    Beleg() {
        belegNummer = ++anzahlBelege;
    } // Beleg

    int nummer() {
        return belegNummer;
    } // nummer

    static int anzahl() {
        return anzahlBelege;
    } // anzahl
} // Beleg

public class TestBeleg {
    public static void main(String[] args) {
        System.out.println("Belege fangen mit Nummer " + Beleg.anzahl() + "an");
        Beleg[] beleg = new Beleg[5];
        for (int i = 0; i < beleg.length; i++) {
            beleg[i] = new Beleg();
        } // for
        for (int i = 0; i < beleg.length; i++) {
            System.out.println(" Beleg mit Nummer " + beleg[i].nummer());
        } // for
    } // main
} // TestBeleg