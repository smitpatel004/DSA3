import java.util.Collections;
import java.util.Scanner;
import  java.util.Arrays;

public class max_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum=0;
        int a[]  =new int[x];
        for(int i=0 ; i<x;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0 ; i<a.length;i++){
            if(a[i]<a[i+1]){
                sum =sum +a[i];
            }
            else{
                sum =sum+a[i+1];
            }
            i++;
        }
        System.out.println(sum);

    }
}
