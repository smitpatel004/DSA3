import java.util.Scanner;

public class oddevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int count=0;
        int coun1=0;
        for(int i=0;i<x;i++){
            int k = sc.nextInt();
            int a[]= new int[k];
            for(int j =0 ;j<k;j++){
                a[j] = sc.nextInt();
            }

            for(int j=1;j<=k;j++){
                if(j%2 ==0){
                    if(a[j-1]%2==0){
                        count++;
                    }

                }
                else{
                    if(a[j]%2 !=0){
                        coun1++;
                    }
                }
            }
            if(count==k/2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
