import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class promo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int q = sc.nextInt();
        Integer a[] = new Integer[x];

        for(int i=0 ; i<x;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0 ;i<q;i++){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            int b[] = new int[q1];

            Arrays.sort(a, Collections.reverseOrder());
//
            for(int j=0;j<q1;j++){
                b[j]=a[j];

            }
            int sum=0;
            Arrays.sort(b);
//
            for(int w=0;w<q2;w++){
               sum +=b[w];
            }
            System.out.println(sum);

        }


    }
}
