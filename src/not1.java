import java.util.Scanner;

public class not1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int j=0;j<n;j++){
                a[j] =sc.nextInt();
                if(a[j]==1){
                    a[j]=a[j]+1;
                }
            }
//            for(int j=0;j<n;j++){
//                if(a[j]==1){
//                    a[j]=a[j]+1;
//                }
//            }


            for(int j=0;j<n-1;j++){

              if(a[j+1]%a[j]==0){
                   a[j+1]=a[j+1]+1;
               }
            }
            for(int j=0;j<n;j++){
                System.out.println(a[j]);
            }

        }
    }
}
