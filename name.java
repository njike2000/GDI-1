import java.util.Scanner;

public class name {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        char name = sc.nextLine().charAt(0);
        sc.close();

        switch (name) {
        case 'a':
        case 'A':
            System.out.println("Anna");
            break;
        case 'b':
        case 'B':
            System.out.println("Berta");
            break;
        default:
            System.out.println("Sonderfall");
            break;
        }
    }

}
