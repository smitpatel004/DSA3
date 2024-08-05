import java.util.Scanner;
public class odddiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        for(int i=0;i<x;i++){
            double n= sc.nextInt();
            if(n%2 !=0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
