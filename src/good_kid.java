import java.util.Scanner;
import java.util.Arrays;
public class good_kid {
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
            Arrays.sort(arr);
            int mul=1;
            arr[0]=arr[0]+1;
            for(int j=0;j<n;j++){
                mul=mul*arr[j];

            }
            System.out.println(mul);



        }

    }
}
