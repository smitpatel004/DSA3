import java.util.Scanner;

public class ArithmeticArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  // Length of the array
            int[] arr = new int[n];
            int sum = 0;

            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();  // Reading array elements
                sum += arr[k];
            }

            int ans = Math.max(0, sum - n);
            System.out.println(ans);
        }

        sc.close();
    }
}
