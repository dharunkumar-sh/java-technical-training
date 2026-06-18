public class QueueLinkedList {

    // Node Class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    // Enqueue Method
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue Method
    void dequeue() {
        if (front == null) {
            System.out.println("Underflow state");
        }
        else if (front.next==null) {
            front = rear = null;
        }
        else {
            front = front.next;
        }
    }

    // Display Method
    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print("|" + temp.data + "|");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
