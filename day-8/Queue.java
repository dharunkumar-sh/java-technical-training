public class Queue {
    int[] arr;
    int front;
    int rear;
    int size;

    // Queue Class
    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue method 
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Overflow state");
            return;
        }
        arr[++rear] = data;
    }


    // Display method
    void display() {
        for(int i = front + 1; i <= rear; i++) {
            System.out.print("|"+ arr[i] + "|");
        }
        System.out.println();
    }




    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
    }
}