// Time Complexity - O(1)

public class Main {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("Sum: " + c);
    }
}

// Time Complexity - O(10)
public class Main {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

// Time Complexity - O(5) and O(5) (for each ‘for’ loop)
public class Main {
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
            }
        }
    }
}

// Time Complexity - O(n)
public class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 2, 1, 1, 2, 0 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (i < n && arr[i] == 1) {
                i++;
            }

            if (i < n) {
                System.out.println(arr[i]);
            }
        }
    }
}

// Time Complexity - O(log n)

public class Main {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 16) {
            System.out.println(i);
            i = i * 2;
        }
    }
}