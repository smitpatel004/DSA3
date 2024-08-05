import java.util.Scanner;

public class beautyofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n");
//        int n = sc.nextInt();
        int ans1=0;
        int ans2=0;
        int arr[][]=new int[6][6];

        int count=0;
        int count1=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++) {

//                count++;
//                System.out.println(count);
//            System.out.println("enter val");
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
//                count1++;
//                System.out.println(count1);
              if(arr[i][j]==1){
                  ans1=Math.abs(3-i);
                  ans2=Math.abs(3-j);
                  break;

              }
            }
        }
        int swap  = ans1+ans2;
        System.out.println(swap);
//        System.out.println("finish");


    }
}
