public class Stack {
    private int[] stack;
    private int anzElement;

    Stack(int stackgroesse) {
        stack = new int[stackgroesse];
        anzElement = 0;
    }

    Stack() {
        stack = new int[10];
        anzElement = 0;
    }

    public void push(int element) {
        stack[anzElement] = element;
        anzElement++;

        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    public int pop() {
        int element = stack[anzElement - 1];
        stack[anzElement - 1] = 0;
        anzElement--;
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
        return element;
    }
}