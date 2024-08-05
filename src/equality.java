import java.util.*;
public class equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[]=new int[(int)x];
        for(int i=0;i<x;i++){
              a[i]=sc.nextInt();
            }
        int count =0;
        int sum =0;
        Arrays.sort(a);
        for(int i =0 ; i<x;i++){
         sum = sum + (a[x-1] - a[i]);
        }
        System.out.println(sum);

    }
}
