import java.util.*;
//import java.util.Scanner;
//import java.util.Arrays;

public class next_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        int temp =0;
        int arr[]=new int[n];


        for(int i=0;i<n;i++){
//            System.out.println("enter val");
            int val = sc.nextInt();
            arr[i]=val;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        Arrays.sort(arr,reverse=True);
////        Arrays.sort(arr);
       for(int i=0;i<n;i++){
           if(arr[i]>=arr[k-1] && arr[i]>0){
               count++;
           }
           else{
               break;
           }
       }

        System.out.println(count);

    }
}
