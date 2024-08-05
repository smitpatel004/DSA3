import java.util.*;

public class flower18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        // Read the beauty values of the flowers
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the beauty values to easily find the min and max values
        Arrays.sort(a);

        // Calculate the maximum beauty difference
        int maxDifference = a[n - 1] - a[0];
        System.out.println(maxDifference);

        // If all flowers have the same beauty value
        if (maxDifference == 0) {
            int ways = n * (n - 1) / 2;
            System.out.println(ways);
        } else {
            // Count the occurrences of the minimum and maximum beauty values
            int minCount = 0;
            int maxCount = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == a[0]) {
                    minCount++;
                }
                if (a[i] == a[n - 1]) {
                    maxCount++;
                }
            }
            // Calculate the number of ways to choose the pairs
            int ways = minCount * maxCount;
            System.out.println(ways);
        }
}
}
