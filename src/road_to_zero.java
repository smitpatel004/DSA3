import java.util.*;
public class road_to_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int count =0;
            long n1 = sc.nextInt();
            long n2 = sc.nextInt();
            long n3 = sc.nextInt();
            long n4 = sc.nextInt();
//           if(n1 == 0 && n2 ==0){
//               System.out.println(0);
//           }
            if (n3 == n4) {
                if (n1 > n2) {
                    System.out.println(n1 * n3);
                } else {
                    System.out.println(n2 * n3);
                }
            } else {
                if((n4)<= (n3*2) ){
                    if(n1<n2){
                        n2 =n2-n1;
                        System.out.println((n1 * n4) + (n2*n3));
                    }
                    else{
                        n1 =n1 -n2;
                        System.out.println((n2 * n4)+(n1*n3));
                    }
                }
                else{
//                    System.out.println("else");
                    long ans1 = n1 +n2;
                    System.out.println(ans1 * n3);


                }

            }
        }
    }
}
