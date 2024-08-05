import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0 ;i<x;i++){
            ArrayList<Integer> arr = new ArrayList();
            int n = sc.nextInt();
            int count1 =0;
            int count2=0;
            int a[] = new int[n];
            int count =0;
            for(int j =0 ; j<n ;j++ ){
                a[j] =sc.nextInt();
                if(a[j]==0){
                    count++;
                }
            }
            if(count ==n){
                System.out.println(0);
            }
            else {
                for(int w=0 ;w<40;w++) {
                    int max = a[0];
                    int min = a[0];
                    for (int j = 0; j < n; j++) {
                        if (a[j] >= max) {
                            max = a[j];
                        }
                        if (a[j] <= min) {
                            min = a[j];
                        }
                    }
//                    System.out.println(max);
//                    System.out.println(min);
//                    System.out.println("done");
                    int mid = (max + min)/2;
                    arr.add(mid);
                    for (int j = 0; j < n; j++) {
                        a[j] = Math.abs(a[j] - mid);
                    }
                    for(int j =0 ;j<n;j++){
                        if(a[j] ==0){
                            count1++;
                        }
                    }
                    if(count1 == n){
                        break;
                    }
                    count2++;

                }

                if(count2<40){
                    System.out.println(arr.size());
                    for(int a1:arr){
                        System.out.println(a1);
                    }
                }
                else{
                    System.out.println(-1);
                }



            }
        }
    }
}
