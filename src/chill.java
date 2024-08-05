import java.util.*;
public class chill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int a[] = new int[x];
        for (int i =0;i<x;i++){
            a[i] = sc.nextInt();

        }
        Arrays.sort(a);
        if(a[x-1] == 1)
            System.out.println("HARD");
        else
            System.out.println("EASY");

    }
}

