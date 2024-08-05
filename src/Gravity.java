import java.util.Arrays;
import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for (int i=0 ;i<x;i++){
            int k = sc.nextInt();
            int a[] = new int[k];

            for(int j =0 ;j<k;j++){
                a[j]= sc.nextInt();
            }
            Arrays.sort(a);
            for(int val :a){
                System.out.println(val);
            }
        }
    }
//}
