import java.util.*;
public class makeit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0 ; i<x;i++) {
            int n = sc.nextInt();
            Integer a[] = new Integer[n];
            int count = 0;
            int count1 =1;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());


                for (int j = 0; j < n-1; j++) {
                    if(a[j]==a[j+1]) {
                            count++;
                    }
                }


            if ((count+1) == n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int j = 0; j < n-1; j++) {
                   if(a[j]==a[j+1]){
                       int temp = a[j+1];
                       a[j+1]=a[n-count1];
                       a[n-count1]=temp;
                   }
                }
                for (int j = 0; j < n; j++) {
                    System.out.println(a[j]);
                    }

            }
        }
    }
}
