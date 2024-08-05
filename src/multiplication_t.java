import java.util.Scanner;

 public class multiplication_t {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        int count = 0;

        // Iterate over each possible row index
        for (int i = 1; i <= n; i++) {
            // Check if i is a divisor of x
            if (x % i == 0) {
                int j = x / i;
                // Check if the corresponding column index j is within bounds
                if (j <= n) {
                    count++;
                }
            }
        }

        // Output the result
        System.out.println(count);
    }
}
