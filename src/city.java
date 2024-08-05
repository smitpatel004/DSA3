import java.util.Scanner;

public class city {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];

        for(int i=0;i<x;i++){
            a[i] = sc.nextInt();
        }
//      int min=0;
//        int max=0;
        int min;
        int max;
        for(int i =0;i<x;i++){
            if(i==0){
                min = a[i]-a[1];
                max= a[i] -a[1];
            }else {
                min = a[i]-a[0];
                max= a[i] -a[0];

            }

            for(int j =0 ;j<x;j++){
                if(min<(a[i]-a[j])){
                    min =(a[i]-a[j]);
                }
                if(max>(a[i]-a[j])){
                    max = (a[i]-a[j]);
                }
            }
            System.out.println(Math.abs(min));
            System.out.println(Math.abs(max));
        }
    }
}
