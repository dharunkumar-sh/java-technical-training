public class Main {
    public static void main(String[] args) {
        int num = 3115;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println("Count: " + count);
    }
}