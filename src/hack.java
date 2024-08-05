import java.util.Scanner;

public class hack {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0 ;i<x;i++){
            int s= sc.nextInt();
            int n= sc.nextInt();
            System.out.println((s*n)-(n-1));
        }
    }
}
