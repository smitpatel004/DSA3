import java.util.*;
public class compit18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int ans=0;
        int ans1=0;
        int count=0;
        int count1 =0;
        int count2 = 0;
        int count3 =0;
        int a[] = new int[x];
        for (int i =0;i<x;i++){
            a[i] = sc.nextInt();

        }
       for(int i =1 ; i<=x;i++){
           if(i % 2 != 0){
               if(a[i] > a[x-1]){
                   ans = ans +a[i];
                   count++;
               }
               else{
                   ans = ans+ a[x-1];
                   count1++;
               }
           }
           else{

                   if(a[i+count]>a[x-1-count1]){
                       ans1 = ans1 + a[i+count];
                       count2++;
                   }
                   else{
                       ans1 =ans1 + a[x-1-count1];
                       count3++;
                   }
               }

           }
       }

    }


