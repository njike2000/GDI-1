import java.util.Scanner;

public class Rot13 {
    public static String rot13(String value) {
        char[] values = value.toCharArray();
        for (int i = 0; i < values.length; i++) {
            char Zeichen = values[i];

            if (Zeichen >= 'a' && Zeichen <= 'z') {
                if (Zeichen > 'm') {
                    Zeichen -= 13;
                } else {
                    Zeichen += 13;
                }
            } else if (Zeichen >= 'A' && Zeichen <= 'Z') {
                if (Zeichen > 'M') {
                    Zeichen -= 13;
                } else {
                    Zeichen += 13;
                }
            }
            values[i] = Zeichen;
        }
        return new String(values);
    }

    public static String rot13Ent(String value) {
        char[] values = value.toCharArray();
        for (int i = 0; i < values.length; i++) {
            char Zeichen = values[i];

            if (Zeichen >= 'a' && Zeichen <= 'z') {
                if (Zeichen > 'm') {
                    Zeichen += 13;
                } else {
                    Zeichen -= 13;
                }
            } else if (Zeichen >= 'A' && Zeichen <= 'Z') {
                if (Zeichen > 'M') {
                    Zeichen += 13;
                } else {
                    Zeichen -= 13;
                }
            }
            values[i] = Zeichen;
        }
        return new String(values);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input = "blabla";
        // String rot13 = rot13(input);
        // String roundTrip = rot13;

        // System.out.println(input);
        System.out.println("Geben Sie den zu verschlüssenden Text ein: \n");
        String input = sc.nextLine();
        System.out.println(rot13(input));

        System.out.println("Geben Sie den zu entschlüssenden Text ein: \n");
        String input2 = sc.nextLine();
        System.out.println(rot13(input2));
        // System.out.println(roundTrip);
        sc.close();
    }
}
