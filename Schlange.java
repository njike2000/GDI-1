public class Schlange {

    private int nextFree;
    private Taxi[] arr;

    public Schlange(int nextFree) {
        this.nextFree = nextFree;
        arr = new Taxi[5];
    }

    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
        nextFree = 0;
    }

    public void ausgeben() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.print("frei ");
            } else {
                System.out.print(arr[i].getNummer() + " ");
            }
        }
    }

    public boolean is_full() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean is_empty() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
    }

    public void enqueue(Taxi x) {

        if (is_full()) {
            System.out.println("Fehler: Das Taxi: " + x.getNummer() + ", " + x.getNamefahrer() + ", "
                    + x.getKennzeichen() + " kann nicht einfahren! Der Taxistand ist picke packe voll!");
        } else {
            arr[nextFree] = x;
            nextFree++;
            System.out.println("Das Taxi " + x.getNummer() + ", " + x.getNamefahrer() + ", " + x.getKennzeichen()
                    + " fährt auf Platz " + nextFree);
        }
    }

    public int indexErstesElement() {
        int indexErstesElement;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                indexErstesElement = i;
                return indexErstesElement;
            }
        }
        return -1;
    }

    public Taxi dequeue() {
        int indexErstesElement = indexErstesElement();
        Taxi ersteTaxi = arr[indexErstesElement];

        if (is_empty()) {
            System.out.println("The array is empty");
            return null;
        } else {
            for (int i = indexErstesElement; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
                arr[i + 1] = null;
            }
            nextFree--;
            return ersteTaxi;
        }
    }
}
