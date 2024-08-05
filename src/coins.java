import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        for (int i =0 ; i<x;i++){
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();
            if(n1%2!=0 && n2%2==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
