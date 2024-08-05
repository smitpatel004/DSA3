import java.util.*;
public class minp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int x = sc.nextInt();
            int sum =0;
            int sum1 = 0;
            int a[] = new int[x];
            for (int i = 0; i < x-1; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < x; i++) {
                if(a[i]>=0){
                    sum =sum+a[i];
                }
                else{
                    sum1 = sum1+a[i];
                }
            }
            System.out.println(-(sum+sum1));
        }
    }
}
