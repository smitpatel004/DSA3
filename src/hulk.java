import java.util.Scanner;
public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i =1;i<=n;i++){
           if(n==1){
               System.out.print("I hate it");
           } else if (i%2!=0) {
               System.out.print("I hate that ");
           } else {
               System.out.print("I love it ");
           }
       }
    }
}
