import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i =0;i<x;i++){
            int ans=0;
            int c = sc.nextInt();
            int k = sc.nextInt();
            if(c<k || c%k!=0){
                System.out.println(1);
                System.out.println(c);
            }
            else{
//              if(k%2 ==0){
                  ans = c-(k+1);
                  System.out.println(2);
                  System.out.println(ans);
                  System.out.println(k+1);
//              }
            }
        }
    }
}
