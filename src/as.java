import java.util.Scanner;

public class as{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        for (int l = 0; l < t; l++) {
            int n = sc.nextInt();  // Length of the array
            int[] a = new int[n];
             int two=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]==2){
                    two++;
                }
            }
            System.out.println(two);
            int twoTillhere=0;
            for (int i = 0; i < n-1; i++) {
                a[i] = sc.nextInt();
                if(a[i]==2){
                    twoTillhere++;
                }
                if(twoTillhere*2 == two){
                    System.out.println(i+1);
                    break;
                }

            }
            if(twoTillhere != two){
                System.out.println(-1);
            }



    }
}}
