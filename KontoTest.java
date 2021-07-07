/*public class KontoTest {
    public static void main(String[] args) {
        Konto meinKonto = new Konto();

        meinKonto.setKontonummer(1254);
        meinKonto.einzahlen(500.);
        meinKonto.einzahlen(1000.);
        System.out.println(meinKonto.getSoldo());
    }//main

}//KontoTest*/
/*class Konto{

    int Kontonummer;
    double Soldo;

    Konto(){

    }//Konto
    Konto(int Kontonummer){
        this.Kontonummer = Kontonummer;
    }//Konto
    Konto(int Kontonummer, double Soldo){
        this.Kontonummer = Kontonummer;
        this.Soldo = Soldo;
    }//Konto
    int getKontonummer(){
        return Kontonummer;
    }
}*/
class KonstruktorTest {
    public static void main(String[] args) {

        /*
         * int Kontonummer; double Soldo; Konto meinKonto = new Konto(); Konto K; K =
         * meinKonto;
         * 
         * Konto K1 = new Konto(); Konto K2 = new Konto(254); Konto K3 = new Konto(1234,
         * 1000);
         * 
         * System.out.println(K1.getKontonummer()); System.out.println(K1.getSaldo());
         * 
         * System.out.println(K2.getKontonummer()); System.out.println(K2.getSaldo());
         * 
         * System.out.println(K3.getKontonummer8()); System.out.println(K3.getSaldo());
         */
        System.out.println("a = " + 0b00000101);
        System.out.println("b = " + 00000101);
        System.out.println("c = " + 0x00000101);
        System.out.println("d = " + (byte) 0b10000101);

    }
}
