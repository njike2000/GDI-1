import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String wort;
        System.out.println("Geben Sie die Wort");
        wort = in.nextLine();
        in.close();

        if (palindrom(wort)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean palindrom(String text) {

        char[] charArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (charArray[i] != charArray[(text.length() - 1) - i]) {
                return false;
            }
        }
        return true;
    }

}
