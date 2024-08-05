
import java.util.Scanner;
import java.util.Arrays;

public class expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n");

        int arr[]=new int[3];


            for (int i = 0; i < 3; i++) {
//            System.out.println("enter val");
                int val = sc.nextInt();
                arr[i] = val;
            }
            Arrays.sort(arr);
//        Arrays.sort(arr);



        if(arr[0]==1 && arr[1]==1 && arr[2]!=1)
        System.out.println((arr[1]+arr[0])*arr[2]);
        else if(arr[0]==1 && arr[1]==1 && arr[2]==1)
            System.out.println(arr[1]+arr[2]+arr[0]);
        else
            System.out.println(arr[1]*arr[0]*arr[2]);



    }
}
