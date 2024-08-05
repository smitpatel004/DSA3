import java.util.Scanner;
public class lotry18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k1,k2,k3,k4,k5 =0;
        int r1,r2,r3,r4;

        int n = sc.nextInt();
        k1=n/100;
        r1=n%100;
        k2=r1/20;
        r2=r1%20;
        k3=r2/10;
        r3=r2%10;
        k4=r3/5;
        r4=r3%5;
        k5=r4/1;
        int total=k1+k2+k3+k4+k5;
        System.out.println(total);

//        int total = k1+k2+k3+r3;
//        System.out.println(total);
//        k1=n/100;
//        int m = n - k1*100;
//        k2 = m/20;
//        int l = m - k2*20;
//        k3 = l/10;
//        int q = l - k3*10;
//        k4 = q/5;
//        int x1 = l - k3*5;
//        k5 = x1/1;
//        int total=k1+k2+k3+k4+k5;
//        System.out.println(total);



    }
}
