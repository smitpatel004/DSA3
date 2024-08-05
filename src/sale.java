import java.util.Scanner;
import java.util.Arrays;
public class sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int x1 = sc.nextInt();
        int arr[] = new int[x];
        int count = 0;


        for (int i = 0; i < x; i++) {
            int l = sc.nextInt();
            arr[i] = l;
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int d = 0; d < arr.length; d++) {
            if (count < x1) {
                if (arr[d] < 0) {
                    sum += arr[d];
                    count++;

                }
            }



        }
        int ans = Math.abs(sum);
        System.out.println(ans);

    }
}

