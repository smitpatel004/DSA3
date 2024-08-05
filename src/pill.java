import java.util.Scanner;

public class pill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] weights = new int[2 * n];

            // Fill the weights array with weights from 2 to 2n
            for (int j = 0; j < 2 * n; j++) {
                weights[j] = 2 * (j + 1);
            }

            int totalWeight = 0;
            for (int weight : weights) {
                totalWeight += weight;
            }

            int target = totalWeight / 2;
            boolean[] dp = new boolean[target + 1];
            dp[0] = true;

            for (int weight : weights) {
                for (int j = target; j >= weight; j--) {
                    dp[j] = dp[j] || dp[j - weight];
                }
            }

            int closest = 0;
            for (int j = target; j >= 0; j--) {
                if (dp[j]) {
                    closest = j;
                    break;
                }
            }

            int pile1Sum = closest;
            int pile2Sum = totalWeight - closest;

            int minDifference = Math.abs(pile1Sum - pile2Sum);
            System.out.println(minDifference);
        }

        scanner.close();
    }
}
