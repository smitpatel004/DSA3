import java.util.*;
public class Array_coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int x = sc.nextInt();
            int sum = 0;
            int sum1 = 0;
            int a[] = new int[x];
            for (int i = 0; i < x ; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < x ; i++) {
                if(a[i] % 2 ==0){
                    sum++;
                }
                else{
                    sum1++;
                }

            }
            if(sum==sum1){
                if(sum>1)
                System.out.println("yes");
                else
                    System.out.println("no");
            }
            else {
                if (sum1 % 2 == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }

        }
    }
}
