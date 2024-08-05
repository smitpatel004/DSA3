import java.util.Scanner;

import static java.lang.Math.abs;

public class newyear_meeting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int m = sc.nextInt();
        int k =sc.nextInt();
        int ans1= abs(x-k);
        int ans2 =abs(m-k);
        if(ans1>ans2){
            System.out.println(ans1);
        }
        else if(ans1<ans2){
            System.out.println(ans2);
        }
        else
            System.out.println(ans1+ans2);




    }
}
