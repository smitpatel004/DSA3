
import java.util.Scanner;
import java.util.Arrays;

public class mid_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n");
        int k= sc.nextInt();
        int arr[]=new int[3];

        for(int l=0;l<k;l++) {
            for (int i = 0; i < 3; i++) {
//            System.out.println("enter val");
                int val = sc.nextInt();
                arr[i] = val;
            }
            Arrays.sort(arr);
//        Arrays.sort(arr);
            System.out.println(arr[1]);
        }

    }
}
