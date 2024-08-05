import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        for(int i=0;i<x;i++){
            int ans =0;
            int r =0;
            int n= sc.nextInt();
            int k = sc.nextInt();
            if(n==1){
                System.out.println(0);
            }
            else{
                if(n%k==0){
                ans = n/k;}
                else{
                    r=n%k;
                    ans = (n/k)+r;
                }
                System.out.println(ans+1);
            }

        }
    }
}
