import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k1,k2,k3,k4 =0;
        int r1,r2,r3 =0;
        int n = sc.nextInt();
//        k1=n/5;
//        r1=n%5;
//        k2=r1/3;
//        r2=r1%3;
//        k3=r2/2;
//        r3=r2%2;
//
//        int total = k1+k2+k3+r3;
//        System.out.println(total);
         k1=n/5;
        System.out.println("k1"+k1);
         int m = n - k1*5;
        System.out.println("m"+m);
         k2 = m/3;
        System.out.println("k2"+k2);
         int l = m - k2*3;
        System.out.println("l"+l);
         k3 = l/2;
        System.out.println("k3"+k3);
         int q = l - k3*2;
        System.out.println("q"+q);
         k4 = q/1;
        System.out.println("k4"+k4);
         int total = k1+k2+k3+k4;
        System.out.println(total);



    }
}
