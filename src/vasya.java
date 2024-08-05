import java.util.Scanner;

public class vasya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
//        if((x/n)>=n){
//
//            int l = x/n;
//            int k =l;
//            while(l>=n){
//                sum = sum +l;
//                l = l /n;
//
//            }
//            System.out.println(sum);
//        System.out.println(x+sum+k);}
//        else{
//            System.out.println(x+(x/n));
//        }
        System.out.println(n+((n-1)/(m-1)));
    }
}
