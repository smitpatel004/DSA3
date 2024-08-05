import java.util.Scanner;
public class one_two1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0 ; i<x;i++){
            int n = sc.nextInt();
            int a[]= new int[n];
            int two = 0;
            int twountill =0;
            for(int j=0 ; j<n ;j++){
                a[j] = sc.nextInt();
                if(a[j] == 2){
                    two++;
                }
            }
            for(int j=0 ; j<n ;j++){

                if(a[j] == 2){
                   twountill++;
                }
//                System.out.println(two);
//                System.out.println(twountill);
                if(twountill*2 == two){
                    System.out.println(j+1);
                    break;
                }
            }
            if(twountill*2 != two){
                System.out.println(-1);
            }
        }
    }
}
