import java.util.Scanner;

public class unitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int count = 0;
            int count1 = 0;

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (a[j] == -1) {
                    count++;
                }
                if(a[j]==1){
                    count1++;
                }
            }
            if(count == count1 && n==2){
                System.out.println(1);}

            else {
                if (count == n)
                    System.out.println(n);
                else {
                    if (count1 < count) {
                        int sub = (count - count1);
                        if (sub == 1)
                            if((count-1)%2==0){

                            System.out.println(1);}
                            else{

                                System.out.println(count);
                            }
                        else
                            System.out.println((count - 1) - count1);

                    } else
                        System.out.println(0);
                }
//                System.out.println(i);
            }

        }
    }
}
