import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int t=2;
        for(int i=0;i<n;i++) {
            int w=0;

            for (int j = 0; j < n; j++) {

                b[i][j] = a[w][t];
                w++;
            }
            t--;

        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


    }
}
