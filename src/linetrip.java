import java.util.Scanner;

public class linetrip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x =sc.nextInt();
            int[] a = new int[n];
            int sub = 0;
            int max = 0;

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            max=2*(x-a[n-1]);
            if(a[0]>max){
                max=a[0];
            }
            if(n==1){
               if(a[0]>max){
                   max=a[0];
               }
            }
            else{
            for (int j = 0; j < n-1; j++) {
               sub = a[j+1]-a[j];
               if(sub>max){
                   max = a[j+1]-a[j];
               }
            }}
            System.out.println(max);


        }
    }
}
