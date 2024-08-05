import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int count=0;
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int j =0; j< n ;j++){
                a[j] = sc.nextInt();
            }
            for(int k=0 ; k<n;k++){
                if(a[0]!=a[1] && a[1]==a[2]){
                    System.out.println(1);
                    break;
                }
               if(a[k]==a[k+1])
                   count++;
               else{
                   System.out.println(count+2);
                   break;
               }
            }


        }
    }
}
