import java.util.*;
//import java.util.Scanner;
//import java.util.Arrays;

public class plus1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int k = sc.nextInt();
            int k1 = sc.nextInt();
            int k2= sc.nextInt();
            if(k+k1==k2){
                System.out.println("+");
            }
            else{
                System.out.println("-");
            }

        }

    }
}
