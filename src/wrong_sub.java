import java.util.Scanner;
public class wrong_sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int last;
        for(int i=0;i<k;i++){
            last=n%10;
            if(last==0){
                n=n/10;
            }
            else{
                n=n-1;
            }
        }
        System.out.println(n);
    }
}
