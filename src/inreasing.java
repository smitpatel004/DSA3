import java.util.Arrays;
import java.util.Scanner;

public class inreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int count=0;
            int s = sc.nextInt();
            int a[] = new int[s];
            for(int j =0 ;j<s;j++){
                a[j]= sc.nextInt();
            }
            Arrays.sort(a);
            for(int j =0 ;j<s-1;j++){
                if(a[j]==a[j+1]){
                    count++;
                    break;
                }
            }
            if(count>=1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }

    }
}
