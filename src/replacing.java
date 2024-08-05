import java.util.*;
public class replacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0; i<x;i++){
            int n = sc.nextInt();
            int a[] = new int[n];

            int b = sc.nextInt();
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);

            for(int j =0 ;j<n ;j++){
                if(a[n-1] <= b){
                    System.out.println("yes");
                    break;
                }
                if(a[0] +a[1] >= b ){
                    System.out.println("no");
                    break;
                }
                else{
                    int count =0;
                    for(int p =0;p<n;p++){
                        if(a[p] <=b){
                            count++;
                        }
                        else{
                            break;
                        }
                    }
                    for(int l =0 ; l<count;l++){
                        if(a[l]+a[l+1]<=b){
                            a[n-(l+1)] = a[ l ]+a[l+1];
                        }

                    }
                    Arrays.sort(a);
                    if(a[n-1] <= b){
                        System.out.println("yes");
                        break;
                    }
                }

            }
        }
    }
}
