public class Main {
    public static void main(String args[]) {
        int n = 1234;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int tens = (int) Math.pow(10, count - 1);
        int firstDigit = n / tens;
        int lastDigit = n % 10;
        int ans = n - tens * firstDigit - lastDigit + tens * lastDigit + firstDigit;
        System.out.println("Ans:" + ans);
    }
}