import java.util.Scanner;
public class lucky1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        for(int i=0;i<x;i++){
            int count=0;
            int sum1=0;
            int sum=0;
            int n,k;
            int x1= sc.nextInt();
            for(int j=0;j<6;j++) {
                 n = x1 % 10;
                x1=x1/10;
//                System.out.println(n);
//                System.out.println(x1);
                if(count<3){
                    sum+=n;

                }
                else{

                    sum1+=n;
                }
                count++;

            }
            if(sum==sum1){
                System.out.println("yes");

            }
            else{
                System.out.println("no");
            }
//            System.out.println(sum);
//            System.out.println(sum1);

        }
    }
}
