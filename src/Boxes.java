import java.util.Scanner;

public class Boxes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x =sc.nextInt();
            int[] a = new int[n];
            int count = 0;
            int max = 0;
            int count1= 0;
            int count2=0;
            int count3=0;
            int count4=0;


            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n-1; j++) {
               if(a[j]<=a[j+1]){
                   count++;
               }
               else{
                   max=j;
                   break;
               }
            }
            for (int j = 0; j < n-1; j++) {
                if(a[j]>a[j+1]){
                    count1++;
                }}
            if((count+1)==n || (count1+1) == n){
                System.out.println("YES");
            }
            else {
                if ((max+1) <= x) {
                    for (int j = 0; j < n-1; j++) {
                        if(j<max){
                            if(a[j]<=a[j+1]){
                                count1++;
                            }
                            else{
                                count2++;
                            }

                        }
                        else{
                            if(a[j]<=a[j+1]){
                                count3++;
                            }
                            else{
                                count4++;
                            }
                        }
                    }
                }
                else{
                    System.out.println("IAM");
                    System.out.println("NO");
                }
                if(((max)==count1 ||((max)==count2)) &&(((Math.abs(max+1)-n)==(count3+1)||(Math.abs(max+1)-n==(count4+1))))){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }



        }
    }
}
