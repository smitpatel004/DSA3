import java.util.Scanner;
public class buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        for(int i =0 ;i<x;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            if(n1>n2){
                System.out.println("First");
            }
            else if(n1<n2){
                System.out.println("Second");
            }
            else {

                if (n3 % 2 == 0) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }
    }
}
