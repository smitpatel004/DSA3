import java.util.Scanner;

public class canI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int k =0;k<x;k++) {

            int x1 = sc.nextInt();
            long arr[] = new long[x1];
            for (int i = 0; i < x1; i++) {
                arr[i] =  sc.nextLong();
            }
            long sum = 0;
            for (int d = 0; d < arr.length; d++) {
                sum += arr[d];
            }
            double ans = Math.floor(Math.sqrt(sum));
            if((ans*ans) == sum ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }



    }
}

