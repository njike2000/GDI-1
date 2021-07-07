import java.util.Scanner;

public class Prenom {
    public static void main(String[] arg) {

        String Prenom = new String();
        char reponse = ' ';
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Donnez un Prenom:");
            Prenom = sc.nextLine();
            System.out.println("Bonjour " + Prenom + ", Comment vas-tu?");

            do {
                System.out.println("Voulez-vous reéssayez?(O/N)");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');

        } while (reponse == 'O');
        System.out.println("Au Revoir");
        sc.close();

    }

}
