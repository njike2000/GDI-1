public class sparguthaben {

    public static void main(String[] arg) {
        int sparguthabenAnfang = 5000;
        double verzinsung = 7.5;
        double sparguthaben = ((verzinsung / 100) * sparguthabenAnfang) + 5000;
        System.out.println("Das sparguthaben beträgt:" + sparguthaben + "EUR");

    }
}
