import java.util.*;

public class midn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
        int a[]=new int[3];
        for(int j=0;j<3;j++){
            int k= sc.nextInt();
            a[j]=k;
        }
        Arrays.sort(a);
            System.out.println(a[1]);
        }

    }
}
