import java.util.*;

public class worldin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count1=0;

        for (int i = 0; i < x; i++) {
            int ans = 0;
            int n = sc.nextInt();
            int count = 0;
            int a[] = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n - 1; j++) {
                if (a[i] == a[j + 1])
                    count++;
            }

            Arrays.sort(a);
            if (count + 1 == n) {
                System.out.println(1);
            } else {
                if (n % 2 == 0) {
                    for (int j = 0; j < (n / 2); j++) {
                        if (a[j] < a[j + 1]) {
                            count1++;
                        }
                    }
                } else {
                    for (int j = 0; j < (n / 2)+1 ; j++) {
                        if (a[j] < a[j + 1]) {
                            count1++;
                        }

                    }
                }

                System.out.println(count1);
            }

        }

    }
}

