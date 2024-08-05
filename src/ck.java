import java.util.Scanner;

public class ck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases

        for (int i = 0; i < t; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long k = scanner.nextLong();

            long operationsLeft = k;
            while (operationsLeft > 0) {
                long initialX = x;

                // Increment x by 1
                x++;

                // Reduce x by dividing by y as much as possible
                while (x % y == 0) {
                    x /= y;
                }

                operationsLeft--;
                if (x == initialX) {
                    break;
                }
            }

            System.out.println(x);
        }

        scanner.close();
    }
}
