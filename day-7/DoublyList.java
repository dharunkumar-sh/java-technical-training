public class DoublyList {

    // Node class
    class DNode {
        int data;
        DNode next;
        DNode prev;

        DNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    DNode head;

    // Insert at begin position
    public void insertAtBegin(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    

    public void printDoubly() {
        DNode temphead = head;
        System.out.print("[");
        while (temphead.next != null) {
            System.out.print(temphead.data + " ");
            temphead = temphead.next;
        }
        System.out.println(temphead.data + " ]");
        while (temphead != null) {
            System.out.print(temphead.data + " ");
            temphead = temphead.prev;
        }
    }

    public static void main(String[] args) {
        DoublyList DL = new DoublyList();
        DL.insertAtBegin(10);
        DL.printDoubly();
    }
}