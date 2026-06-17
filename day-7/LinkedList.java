public class LinkedList {
    Node head;

    // Node Class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at begin position
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBegin(data);
            return;
        }
        Node temphead = head;
        for (int i = 0; i < position - 1 && temphead != null; i++) {
            temphead = temphead.next;
        }
        if (temphead == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temphead.next;
        temphead.next = newNode;
    }

    // Insert at end position
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temphead = head;
        while (temphead.next != null) {
            temphead = temphead.next;
        }
        temphead.next = newNode;
    }

    // Delete at begin position
    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    // Delete at position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            deleteAtBegin();
            return;
        }
        Node temphead = head;
        for (int i = 0; i < position - 1 && temphead != null; i++) {
            temphead = temphead.next;
        }
        if (temphead == null || temphead.next == null) {
            System.out.println("Invalid position");
            return;
        }
        temphead.next = temphead.next.next;
    }

    // Delete at end position
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temphead = head;
        while (temphead.next.next != null) {
            temphead = temphead.next;
        }
        temphead.next = null;
    }

    // Print the linked list
    public void printList() {
        Node temphead = head;
        System.out.print("[");
        while (temphead != null) {
            System.out.print(temphead.data + " ");
            temphead = temphead.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtBegin(100);
        ll.insertAtEnd(300);
        ll.insertAtEnd(400);
        ll.insertAtPosition(200, 1);
        ll.deleteAtPosition(1);
        ll.printList();
    }

}