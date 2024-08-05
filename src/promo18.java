import java.util.Scanner;
public class promo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            int y=sc.nextInt();
            int ans=0;
            for(int j=0;j<y;j++){
//                System.out.println("IN");

                for(int k=2;k<=x;k++){
//                    System.out.println("IN@");
                    if(x%k==0){
                        x=k+x;
//                        System.out.println("k"+k);
//                        System.out.println("xin"+x);
                        break;
                    }
                }
//                x=ans;

//                System.out.println(n);

            }
            System.out.println(x);
        }

    }
}
