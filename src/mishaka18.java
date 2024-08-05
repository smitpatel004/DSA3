import java.util.Scanner;
import java.util.Arrays;
public class mishaka18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int count =0;
        int count1=0;
        int arr[][] =new int[x][2];
        for(int i=0;i<x;i++) {
            for(int j=0;j<2;j++){
                int val =sc.nextInt();
               arr[i][j] = val;
            }
        }

        for(int i=0;i<x;i++) {
            for(int j=0;j<1;j++){
             if( arr[i][j]>arr[i][j+1]){
                 count++;
             }
             else{count1++;}

            }
        }
        if(count>count1){
            System.out.println("Mishka");}
        else if(count1 < count){
            System.out.println("Chris");}

        else{
            System.out.println("Friendship is magic!^^");
        }

    }
}
