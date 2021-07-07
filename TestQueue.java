import java.util.Scanner;

public class TestQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Queue Queue1 = null;

        while (true) {
            System.out.println("----Wilkomme---");
            System.out.println("1: Der Queue mit einer bestimmten Groesse anlegen");
            System.out.println("2: Der Queue mit dem standard Groesse anlegen");
            System.out.println("3: Ein Element in den Queue hinzufuegen");
            System.out.println("4: Ein Element aus dem Queue entfernen");
            System.out.println("0: Das Programm beenden");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Bitte geben Sie die Groesse des Queue ein: ");
                int groesse = sc.nextInt();
                Queue1 = new Queue(groesse);
                System.out.println("Der Queue wurde korrekt angelegt");
            } else if (option == 2) {
                Queue1 = new Queue();
                System.out.println("Der Queue wurde korrekt angelegt");
            } else if (option == 3) {
                System.out.println("Bitte geben Sie das Element ein: ");
                int element = sc.nextInt();
                Queue1.enqueue(element);
            } else if (option == 4) {
                Queue1.dequeue();
            } else {
                break;
            }

        }
        sc.close();
    }

}
