public class App {

    public static void main(String[] args) {
        Taxi a = new Taxi("Njike", "NMS", 1);
        Taxi b = new Taxi("Samuel", "CM52R", 2);
        Taxi c = new Taxi("Samuel", "CM52R", 3);
        Taxi d = new Taxi("Samuel", "CM52R", 4);
        Taxi e = new Taxi("Samuel", "CM52R", 5);
        Taxi f = new Taxi("Samuel", "CM52R", 6);
        Taxi g = new Taxi("Samuel", "CM52R", 7);
        Taxi h = new Taxi("Samuel", "CM52R", 8);

        Schlange taxistand = new Schlange(0);

        System.out.println("Ausganssituation");
        taxistand.clear();
        taxistand.ausgeben();

        System.out.println("\n1. Situation");
        taxistand.clear();
        taxistand.enqueue(a);
        taxistand.enqueue(b);
        taxistand.enqueue(c);
        taxistand.enqueue(d);
        taxistand.enqueue(e);
        taxistand.enqueue(f);
        taxistand.enqueue(g);
        taxistand.enqueue(h);
        taxistand.dequeue();
        taxistand.ausgeben();
        taxistand.enqueue(h);
        taxistand.ausgeben();

    }

}
