import java.util.Scanner;
class   FactorialExample2 {

}
//    public static void main(String args[]){
//        int i,fact=1;
//        int number=4;//It is the number to calculate factorial
//        fact = factorial(number);
//        System.out.println("Factorial of "+number+" is: "+fact);
//    }
//}
public class devide {

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i =0;i<test;i++) {
            int n1 = sc.nextInt();
            int num = factorial(n1);
           int r = (n1/2)+1;
           int rm = factorial(r);
           int nr1 = n1-r;
           int nr = factorial(nr1);
           int ans=(num)/(rm*(nr));
            System.out.println(ans);


        }
    }
}
