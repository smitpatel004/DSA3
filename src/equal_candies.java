import java.util.Scanner;
import java.util.Arrays;
public class equal_candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int n =sc.nextInt();
            int arr[]=new int[n];
             for(int j=0;j<n;j++){
                 int l = sc.nextInt();
                 arr[j]=l;
             }


             int sum=0;
              Arrays.sort(arr);

            for(int z=0;z<arr.length;z++){
              int mn = arr[z] - arr[0];
               sum= mn + sum;
            }
            System.out.println(sum);

        }

    }
}
