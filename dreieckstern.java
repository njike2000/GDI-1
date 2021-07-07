
public class dreieckstern {

    public static void main(String[] arg) {
        int n = 10;
        for (int j = 0; j <= n; j++) {

            for (int i = 0; i < 10 - j; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (j * 2 + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
