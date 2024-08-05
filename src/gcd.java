import java.util.Scanner;

public class gcd {

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, Math.abs(a - b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){



            int ans =0;
            int n= sc.nextInt();
            int a[] = new int[n];
            for(int j =0 ;j<n;j++){
                a[j] = sc.nextInt();
            }
            for(int j =0 ;j<n-1;j++){
                for(int k=i+1;k<n-1;k++){
               if(gcd(a[i],a[j])<=2){
                  ans++;
                  break;
               }

            }}
            if(ans>=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }




        }
    }
}
