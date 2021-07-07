public class Queue {
    private int nextFree;
    private int[] arr;

    Queue(int queuegroesse) {
        arr = new int[queuegroesse];
        nextFree = 0;
    }

    Queue() {
        arr = new int[5];
        nextFree = 0;
    }

    public boolean is_full() {
        if (nextFree == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean is_empty() {

        if (nextFree == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void enqueue(int element) {

        if (is_full()) {
            System.out.println("The array is full");
        } else {
            arr[nextFree] = element;
            nextFree++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void dequeue() {

        if (is_empty()) {
            System.out.println("The array is empty");
        } else {
            for (int i = 0; i < nextFree; i++) {
                arr[i] = arr[i + 1];
                arr[i + 1] = 0;
            }
            nextFree--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
