import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        Stack stack1 = null;
        while (true) {
            System.out.println("-------Willkommen! Machen Sie eine Wahl bitte-------");
            System.out.println("1: Der Stack mit einer bestimmten Groesse anlegen");
            System.out.println("2: Der Stack mit dem standard Groesse anlegen");
            System.out.println("3: Ein Element in den Stack hinzufuegen");
            System.out.println("4: Ein Element aus dem Stack entfernen");
            System.out.println("0: Das Programm beenden");
            option = in.nextInt();

            if (option == 1) {
                System.out.println("Bitte geben Sie die Groesse des Stacks ein: ");
                int groesse = in.nextInt();
                stack1 = new Stack(groesse);
                System.out.println("Der Stack wurde korrekt angelegt");
            } else if (option == 2) {
                stack1 = new Stack();
                System.out.println("Der Stack wurde korrekt angelegt");
            } else if (option == 3) {
                System.out.println("Bitte geben Sie das Element ein: ");
                int element = in.nextInt();
                stack1.push(element);
            } else if (option == 4) {
                stack1.pop();
            } else {
                break;
            }
        }
        in.close();
    }
}
