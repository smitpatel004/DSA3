import java.util.Scanner;

public class ribonpaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            int n = sc.nextInt();
            int m= sc.nextInt();
            int k = sc.nextInt();
            if(m == 1){
                System.out.println("NO");
            }
            else{
                if(m>k){
                    System.out.println("YES");
                }
                else{
                   if(n/k<=m){
                       System.out.println("YES");
                   }
                   else{
                       System.out.println("NO");
                   }

                }            }
        }
    }
}
