import java.util.Arrays;
import java.util.Scanner;

public class good_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<x;i++ ){
            int count=0;
            long sum=0;
//            int count1=0;
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();

            }
            for(long el:a){
                sum+=el;
                if(el==1){
                    count++;
                }
            }
            if(sum>=count+n && n>1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}
