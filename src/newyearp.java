import java.util.*;
//import java.util.Scanner;
//import java.util.Arrays;

public class newyearp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

//        System.out.println("enter n");
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+(5*i);
        }
        int ans=k/sum;
        System.out.println(ans);
        System.out.println(sum);


    }
}
