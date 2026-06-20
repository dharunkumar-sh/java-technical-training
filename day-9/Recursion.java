public class Recursion {
    public int add(int n, int sum) {
            if (n != 0) {
                sum += n;
                return add(n - 1, sum);
            }
           return sum;
    }
    
    public static void main(String[] args) {
        Recursion r = new Recursion();
        // Add all number till n
        System.out.println(r.add(10, 0));
    }
}
