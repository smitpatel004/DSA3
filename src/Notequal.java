import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Notequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum=0;
        int sum1=0;
        int count=0;
        Integer a[] = new Integer[x];
        for(int i=0;i<x;i++){
            a[i] = sc.nextInt();
        }
//        Arrays.sort(a);
        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0;i<x;i++){
            sum =sum +a[i];
        }

        for(int i=0;i<x;i++){
            sum1 = sum1 +a[i];
            sum = sum -a[i];
            if(sum >=sum1){
                count++;
            }
        }
        System.out.println(count+1);


    }
}