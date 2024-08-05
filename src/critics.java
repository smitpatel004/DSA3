import java.util.*;
public class critics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0 ; i<x;i++){
            int m[] = new int[3];
            for(int j =0 ; j<3 ;j++)
                m[j] = sc.nextInt();
            Arrays.sort(m);
            int ans = m[1] + m[2];
            if(ans>=10)
                System.out.println("YES");
            else{
                System.out.println("NO");
            }

        }
    }
}
