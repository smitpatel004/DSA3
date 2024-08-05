import java.util.*;
public class kid {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

            int count1 =0;
            int n = sc.nextInt();
            Integer a[] = new Integer[n];

            for (int j = 0; j < n; j++) {
                a[j] = Math.abs(sc.nextInt());
            }
            Arrays.sort(a);
        System.out.println(a[0]);


            }
        }
