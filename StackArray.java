<<<<<<< HEAD

package midterm;
=======
package stackarray;
>>>>>>> fcfcf9d8a83487c25a484fc700e5ac2bf7cd9d69

public class StackArray {

    private int[] stack;
    private int top;
    private int capacity;

<<<<<<< HEAD
    public StackArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

=======
    // Constructor
    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push method
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Pop method
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek method
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Display method
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Create a stack with capacity of 5
        StackArray stack = new StackArray(5);

        // Push elements
>>>>>>> fcfcf9d8a83487c25a484fc700e5ac2bf7cd9d69
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
<<<<<<< HEAD
        stack.push(60);


        System.out.println("Peek: " + stack.peek());
        System.out.println("Empty?: " + stack.isEmpty());
        System.out.println("Full?: " + stack.isFull());

      
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        stack[top] = value;
        System.out.println("Pushed at " + top + ": " + value);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top];
        top--;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
=======

        System.out.println();

        // Display stack
        stack.display();

        System.out.println();

        // View top element
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        System.out.println();

        // View top again
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        // Display stack again
        stack.display();
    }
}
>>>>>>> fcfcf9d8a83487c25a484fc700e5ac2bf7cd9d69
