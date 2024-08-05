import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=0 ;i<x;i++){
            int k = sc.nextInt();
            int count =0;
            int count1=0;
            int o=0;
            int a[] = new int[k];
            for(int j =0 ;j<k;j++){
                a[j]= sc.nextInt();
            }
            Arrays.sort(a);
            for(int j =0 ;j<k-1;j++){
                if(a[j]==a[j+1]){
                    count++;
                    // o=j;
                }
            }
            for(int j =0 ;j<k-1;j++){
//                System.out.println(a[j]);
                if(a[j]==a[j+1]){

                    count1++;

                }
            }
            if(count == k-1){
                System.out.println(0);
            }
            else{


                k=k-(count1+1);

                System.out.println(k*a[0]);

            }
        }
    }
}
