public class Stack {
    int[] arr;
    int top;
    int size;

    // Stack Class
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push method 
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Overflow state");
            return;
        }
        arr[++top] = data;
    }

    // Pop method
    void pop() {
        if (top == -1) {
            System.out.println("Underflow state");
            return;
        }
        top--;
    }

    // IsEmpty method 
    void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    // Peek method 
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + arr[top]);
        }
    }
    

    // Display method 
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println("|"+ arr[i] + "|");
        }System.out.print("____");
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.display();
    }
}