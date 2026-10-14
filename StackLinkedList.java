
package midterm;

public class StackLinkedlist {
    private class Node {
        int data;
        Node next;

       
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

  
    private Node top;

    public StackLinkedlist() {
        top = null;
    }
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }

        return top.data;
    }
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }

        Node current = top;

        System.out.println("Stack elements:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {

        StackLinkedlist stack = new StackLinkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        stack.display();
    }
}
