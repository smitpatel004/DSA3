import java.util.Scanner;

public class needz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int ans =0;
            int n= sc.nextInt();
            int a[] = new int[n];
            for(int j =0 ;j<n;j++){
                a[j] = sc.nextInt();
                ans ^=a[j];
            }


//            if(ans==0)
//                System.out.println(0);
//            else{
//                if(n%2==1){
//                    System.out.println(ans);
//                }else {
//                    System.out.println(-1);
//                }
//            }
            if(n%2==0){
                if(ans==0){
                    System.out.println(0);
                }
                else{
                    System.out.println(-1);
                }

            }
            else{
                System.out.println(ans);
            }
        }
    }
}
