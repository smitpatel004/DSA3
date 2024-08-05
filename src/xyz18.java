import java.util.Arrays;
import java.util.Scanner;

public class xyz18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0 ;i<x;i++){
            int n = sc.nextInt();
            int a[] = new int[n+1];
            for(int j =1 ; j<=n ;j++ ){
                a[j] =sc.nextInt();
            }
           int max = a[1];
//            for(int j =1; j<=n ;j++ ){
//                    if(a[j]>=max);
//                    max=a[j];
//            }
            for(int j =1; j<=n;j++ ){
               if(j%2!=0){
                   if(max>=a[j]){
                       max=a[j];
                   }
               }
            }
            System.out.println(max);

        }
    }
}
