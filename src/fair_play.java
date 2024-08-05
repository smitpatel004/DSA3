import  java.util.Scanner;
import java.util.Arrays;
public class fair_play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max1;
        int x = sc.nextInt();
        for(int i=0;i<x;i++) {
            int a[]=new int[4];
                for(int j=0;j<4;j++){
                    int k= sc.nextInt();
                    a[j]=k;
                }
            int max = Arrays.stream(a).max().getAsInt();
                if(max!=a[0]) {
                     max1 = a[0];
                    for (int jj = 0; jj < 4; jj++) {
                        if (max1 < a[jj] && a[jj] < max) {
                            max1 = a[jj];
                        }
                    }
                }
                else{
                    max1=a[1];
                    for (int jj = 0; jj < 4; jj++) {
                        if (max1 < a[jj] && a[jj] < max) {
                            max1 = a[jj];
                        }
                    }

                }

                if((max == a[0])&&(max1 == a[2])||(max1 == a[0])&&(max == a[2])||(max == a[1])&&(max1 == a[3])||(max1 == a[1])&&(max == a[3])||(max1 == a[1])&&(max == a[2])||(max == a[1])&&(max1 == a[2])){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

        }

    }
}