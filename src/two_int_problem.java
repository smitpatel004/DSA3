import java.util.Scanner;

import static java.lang.Math.abs;

public class two_int_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int m =sc.nextInt();
            int n=sc.nextInt();
            int count=1;
            if(n==m){
                System.out.println(0);
            }
            else if(m>n){
                int l = m-n;
                int k=l/10;
                if(k%10 !=0){
                count = count*(k+1);
                System.out.println(count);}
                else{
                    System.out.println(count*k);
                }



            }
            else {
                int q=n-m;
                int w=q/10;
                if(w%10 !=0){
                    count = count*(w+1);
                    System.out.println(count);}
                else{
                    System.out.println(count*w);
                }


            }




        }

    }
}
