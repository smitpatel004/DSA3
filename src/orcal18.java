import java.util.Scanner;

public class orcal18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        for(int i=0;i<x;i++){

            int n= sc.nextInt();
            int ans=n;
            int k= sc.nextInt();
            int mini =2147483647;
            for(int j=1;j<Math.sqrt(n);j++){
                if(n%j==0){
                    if(j!=1){
                           mini= Math.min(mini,j);
                    }
                    if(n/j!=j){
                        mini=Math.min(mini,n/j);
                    }
                }
            }
            ans=ans+mini;
            ans+=(k-1)*2;
            System.out.println(ans);
        }
    }
}
