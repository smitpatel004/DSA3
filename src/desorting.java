import java.util.*;
public class desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int count1 = 0;
            int count =0;
            int n = sc.nextInt();
            Integer a[] = new Integer[n];


            for (int j = 0; j < n; j++) {
                a[j] = Math.abs(sc.nextInt());
            }
            for (int j = 0; j < (n - 1); j++) {
                if (a[j] > a[j + 1]) {
                    count++;
                    System.out.println(0);
                    break;
                }
            }
            for(int j=0;j<(n-1);j++) {
            if(count==0){

                    int min = a[1] - a[0];
                    if (a[j + 1] - a[j] < min) {
                        min = a[j + 1] - a[j];
                    }
                    count1 = min;


                }
            }


           if(count==0)
            System.out.println((count1/2)+1);



        }
    }
}
