import java.util.*;
class fac{
static int factorial(int n) {
    if (n == 0)
        return 1;
    else
        return (n * factorial(n - 1));
}
}
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = sc.nextInt();
        if(k==1){
            int ans = fac.factorial(x);
            int ans1 = fac.factorial(x-2);
            int comb = ans / (2*ans1);
            System.out.println(comb);
            System.out.println(comb);
        }
        else{
            int l = x - k;
            if(l ==1){
                System.out.println(1);
                System.out.println(1);
            }
            else {
                int ans = fac.factorial(l);
                int ans1 = fac.factorial(l - 2);
                int comb = ans / (2 * ans1);
                System.out.println(comb);
                System.out.println(ans);
            }
        }
    }
}
