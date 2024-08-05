import java.util.Scanner;
public class colorfull{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        String a[][]=new String[n][x];

        for(int i=0;i<n;i++) {
            for(int j=0;j<x;j++)
            {
                String k = sc.next();
                a[i][j] = k;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<x;j++)
            {
                if(a[0][1] == "B" || a[0][1] == "W"){
                    System.out.println("#Color");
                    break;
                }
                else
                    System.out.println("#Black&White");
                break;
            }
            break;
        }
    }
}
