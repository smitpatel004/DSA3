import java.util.Scanner;


public class jagged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int mn = Integer.MAX_VALUE;
            System.out.println(mn);
            for (int num : arr) {
                mn = Math.min(mn, num);
            }
            System.out.println(mn);
            if (arr[0] != mn) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
