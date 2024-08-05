import java.util.Scanner;

public class Game01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            String s =sc.next();
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    count++;
                }
            }
            if (Math.min(count, (s.length() - count)) % 2 == 0) {
                System.out.println("NET");
            } else {
                System.out.println("DA");
            }
        }
    }
}