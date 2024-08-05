import java.util.Scanner;
public class cut_ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count =0;
        if(a<n){
            count++;
        }
        if(b!=a && b<n){
            count++;
        }
        if(c!=a && b!=c && c<n){
            count++;
        }
        if(a==b && b==c && c==n){
            System.out.println(1);
        }else{
        System.out.println(count);}
    }
}
