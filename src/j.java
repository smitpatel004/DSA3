import java.util.Scanner;

public class j {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t!=0) {
              int n = scanner.nextInt();
              int cnt =0;
            for(int i=0;i<n;i++)
            {
                int x = scanner.nextInt();
                if(x%2!=0)cnt++;
            }
            if(cnt%2==0){
                System.out.println("yes");
            }
            else
                System.out.println("no");
             }
        }
    }

