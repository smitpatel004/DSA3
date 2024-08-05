import java.util.Scanner;

public class twopr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            if(n2+n3<=n1-2 || (n1==n2  && n1==n3)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }}
}
