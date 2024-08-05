import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            boolean isSorted = true;
            int minDiff = Integer.MAX_VALUE;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    break;
                }
                minDiff = Math.min(minDiff, a[j + 1] - a[j]);
            }

            if (!isSorted) {
                System.out.println(0);
            } else {
                System.out.println((minDiff / 2) + 1);
            }
        }
        sc.close();
    }
}
