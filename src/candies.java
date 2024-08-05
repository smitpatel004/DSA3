import java.util.Scanner;
public class candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=0;i<m;i++) {
            int n = sc.nextInt();
            int r = (n / 2) + 1;
            int num = n - r;
            System.out.println(num);
        }
    }
}

