public class Fibonnacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
