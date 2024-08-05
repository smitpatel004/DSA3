import java.util.*;

public class costt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int count1=0;


            int n = sc.nextInt();
            int k  = sc.nextInt();
            int a[] = new int[n];


            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {

         if(k==a[j]){
            count1++;
         }

         }
            if(count1>=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }

    }
}

