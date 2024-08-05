import java.util.Scanner;
public class banana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= w; i++) {
            ans = ans + (i * k);
        }
        int ans1;
//        if (n >= ans) {
//
//        } else {
            if (n > ans) {
//                ans1 = n - ans;
//                System.out.println(ans1);
                System.out.println(0);
            } else {
                ans1 = Math.abs(ans - n);
                System.out.println(ans1);
            }
        }
//    }
}
