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

    // Insert at begin end position
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

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

    // Delete at begin end position
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
        ll.insertAtEnd(200);
        ll.insertAtEnd(300);
        ll.deleteAtBegin();
        ll.printList();
    }

}