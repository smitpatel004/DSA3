import java.util.Scanner;

public class soccer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x1 = sc.nextInt();
            int n1 = sc.nextInt();
            int x2 = sc.nextInt();
            int n2 = sc.nextInt();
            int dx = x2 - x1;
            int dy = n2 - n1;
            if (n1 == 0 && n2 == 0) {
                System.out.println("YES");
            } else {
                if (dx - dy <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}