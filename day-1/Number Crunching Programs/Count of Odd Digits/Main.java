public class Main {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Odd digit count: " + count);
    }
}