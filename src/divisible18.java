import java.util.Scanner;
public class divisible18 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int ans;
       int x = sc.nextInt();
       for(int i=0;i<x;i++){
           int x1 = sc.nextInt();
           int x2= sc.nextInt();
           ans=x1%x2;
           System.out.println(ans);
       }
    }
}
