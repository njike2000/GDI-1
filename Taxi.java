public class Taxi {
    private String namefahrer;
    private String kennzeichen;
    private int nummer;

    public Taxi(String namefahrer, String kennzeichen, int nummer) {
        this.namefahrer = namefahrer;
        this.kennzeichen = kennzeichen;
        this.nummer = nummer;
    }

    public String getNamefahrer() {
        return namefahrer;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getNummer() {
        return nummer;
    }

}
