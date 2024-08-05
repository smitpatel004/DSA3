import java.util.*;

public class stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();
            int count = 0;
            int count1 = 0;

            int a[] = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();

            }
            Arrays.sort(a);
            for (int j = 0; j < n - 1; j++) {
                if (a[j] == a[j + 1]) {
                    count++;
                }
                else{
                    break;
                }

            }
            if ((count + 1) == n) {
                System.out.println(-1);
            } else {
                System.out.println(count+1);
                System.out.println(n-(count+1));
                for (int j = 0; j < n; j++) {
                   if((count+1) <=j){
//                       System.out.println("bye");
                       System.out.println(a[j]);
                   }
                   else{
//                       System.out.println("hi");
                       System.out.println(a[j]);
                   }
                }


            }

        }
    }}

