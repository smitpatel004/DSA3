import java.util.Scanner;

public class qqq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = (k * l) / nl;
        int totalSalt = p / np;
        int totalLimes = c * d;

        int maxToasts = Math.min(totalDrink, Math.min(totalSalt, totalLimes));

        System.out.println(maxToasts / n);
    }
}
