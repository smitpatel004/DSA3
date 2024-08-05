import java.util.*;

public class easy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int ans=0;
            int sub=0;
            int n = sc.nextInt();
            int count=0;
            int a[] = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
//            if(){
//                System.out.println("in");
//                System.out.println(0);
//
//            }

            for (int j = 0; j < n-1; j++) {
               if(a[j]<=a[j+1]){
                   count++;

               }
               else{
                   ans =ans+(a[j]-a[j+1]);
//                   if(a[n-2]>a[n-1]){
//                       sub = a[n-2]-a[n-1];
//                   }
               }
            }

//


            if((count+1)==n){
                System.out.println(0);
            }
            else{
                System.out.println(ans+1);
            }

        }
    }
}

