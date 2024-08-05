import java.util.Scanner;
public class socks1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int k = sc.nextInt();
        int c=0;
        while( k!=0){
            c++;
            x--;
            k--;
            if(x==0){break;}

        }
//        int l=x-c;
//        System.out.println(l);
//        l = l/2;

        System.out.println(c);
        if(k==0)
        System.out.println(x/2);
        else
            System.out.println(k/2);

    }
}
