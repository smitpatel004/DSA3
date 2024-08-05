
import java.util.Scanner;
import java.util.Arrays;

public class taxi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int count1=0;
        int count2=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i] = val;
        }
        for (int i = 0; i < n; i++) {
           if(arr[i]>4){
               count++;
           }
           else{
               sum =sum+arr[i];
           }
           if(arr[i]==3){
               count1++;
           }
           if(arr[i]==2){
               count2++;
           }
        }
        if(count1 == n-1 && count2==1){
            System.out.println(n);
        }
        else {
            if (sum % 4 == 0)
                System.out.println((sum / 4) + count);
            else
                System.out.println((sum / 4) + 1 + count);
        }

    }
}
