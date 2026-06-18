public class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    // Push method 
    void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Pop method
    void pop() {
        if (top == null) {
            System.out.println("Underflow state");
            return;
        }
        top = top.next;
    }

    // Peek method
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }

    }

    // isEmpty method
    void isEmpty() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    // Display method
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(" | " + temp.data + " | ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.isEmpty();
        stack.peek();
    }

}