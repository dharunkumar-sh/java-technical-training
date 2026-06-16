//Pattern problem - (n = 5)

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Pattern problem - (n = 5 with alternative row values)

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i % 2 == 0 ? "0" : "1");
            }
            System.out.println();
        }
    }
}

// Box using for loop (*)

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// Print the (*) pattern as in X format.

public class Main {
public static void main(String[] args) {
int n = 7;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if(j==i|| j==n-i+1) System.out.print('*');
            else System.out.print(" ");
        }
        System.out.println();
    }
}
}