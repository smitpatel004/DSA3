import java.util.*;
public class plust_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i<n ;i++){
            int x = sc.nextInt();
            int a[] = new int[x];
            for(int j =0 ; j<x ;j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = a[x-1]-a[0];
            System.out.println(ans);

        }
    }
}
