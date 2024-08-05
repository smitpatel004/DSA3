
import java.util.Scanner;
import java.util.Arrays;

public class honest_coach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int j =0 ; j<k;j++){
        int n = sc.nextInt();
        int arr[]=new int[n];


        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr[i]=val;
        }
        Arrays.sort(arr);
        int min = arr[1]-arr[0];
        for(int i =0 ;i<n-1;i++){
            if(min>Math.abs(arr[i+1]-arr[i])){
                min = Math.abs(arr[i+1]-arr[i]);
            }

        }
        System.out.println(min);



    }
}}
