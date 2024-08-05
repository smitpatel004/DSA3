import java.util.Scanner;

public class ffd{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            System.out.println(minMoves(a, b, c, d));
        }
    }

    private static long minMoves(long a, long b, long c, long d) {
        if (d < b) {
            return -1; // can't decrease y
        }
        long dy = d - b;
        long dx = c - a;
        if (dx < dy) {
            return -1; // can't have more y increases than x increases
        }
        if ((dx - dy) % 2 != 0) {
            return -1; // remaining x difference must be even
        }
        return dy + (dx - dy); // dy diagonal moves + (dx - dy) left moves
    }
}
