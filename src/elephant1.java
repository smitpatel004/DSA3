import java.util.Scanner;
public class elephant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int ans = x/5;
        if(x%5==0){
            System.out.println(ans);
        }
        else{
        System.out.println(ans+1);}
    }
}
