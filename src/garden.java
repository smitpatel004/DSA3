import java.util.*;

public class garden{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int ans=0;
            int n = sc.nextInt();
            int count=0;
            int a[] = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
//
            for (int j = 0; j < n-1; j++) {
                if(a[j]<=a[j+1]){
                    count++;
                    ans =ans+a[i];

                }
            }
            ans =ans+a[n-1];




            if((count+1)==n){
                System.out.println(ans);
            }
            else{
                System.out.println(a[0]);
            }

        }
    }
}

