public class ggtEuklid {
    
    public static void main(String[] args) {
        int a = eingabeA();
        int b = eingabeB();
        int result = ggT(a, b);
        ausgabe(result);
    }

    static int ggT(int a, int b) {
        int r;
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }// ggT

    static int eingabeA() {
        int n = 30;
        return n;
    }// eingabeA

    static int eingabeB() {
        int n = 6;
        return n;
    }// eingabeB

    static void ausgabe(int result) {
        System.out.println("ggT liefert das folgende Ergebn: " + result);
    }
}// Eukild