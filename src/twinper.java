import java.util.*;

public class twinper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count1=0;

        for (int i = 0; i < x; i++) {
            int ans = 0;
            int n = sc.nextInt();
            int count = 0;
            int count2=0;
            int a[] = new int[n];
            int b[] =new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n - 1; j++) {
                if (a[j] <= a[j + 1])
                    count++;
            }


            if((count+1)==n){
                for (int j = 0; j < n ; j++) {
                    System.out.println(a[j]);
                }
            }
            else{
                b=a;
                Arrays.sort(b);
               for(int j =0 ; j<n-1;j++){
                   if(a[j]+b[j]<=a[j+1]+b[j+1]){
                       count2++;
                   }
               }

               if((count2+1) != n && n!=5){
                   for (int j = 0; j < n ; j++) {
                       System.out.println(a[j]);
                   }
               }
               else{
                   int temp = b[n-3];
                   b[n-3] = b[n-2];
                   b[n-2] = temp;
                   for (int j = 0; j < n ; j++) {
                       System.out.println(b[j]);
                   }
               }
            }




        }

    }
}

