import java.util.Scanner;

public class walking {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int ans =0;
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();
            if(b<=d&&c<=a+d-b) {
                System.out.println((d-b)+(a+d-b-c));
            } else {
                System.out.println(-1);
            }

        }
    }
}
