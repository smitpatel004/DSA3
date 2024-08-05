import java.util.Scanner;
public class goodArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0 ; i<x;i++){
            int n = sc.nextInt();
            int a[]= new int[n];
            int count=0;
            for(int j =0 ;j<n;j++){
                a[j] = sc.nextInt();
            }
            for(int j =0 ;j<n-1;j++){
                if(a[j]%2==0 && a[j+1]%2==0 ||a[j]%2!=0 && a[j+1]%2!=0 ){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
