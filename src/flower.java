import java.util.*;
public class flower {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int x = sc.nextInt();
       long a[] = new long[x];
       for(int i =0 ; i<x ;i++)
           a[i]= sc.nextInt();
       Arrays.sort(a);
        if(x == 2){
            long ans = Math.abs(a[0] - a[1]);
            System.out.println(ans);
            System.out.println(1);
        }

        else{
            long ans = (a[1] - a[0]);
            System.out.println(ans);
            long count =0;
            long count1 =0;
            for(int j =0 ; j<x;j++ ){
                if(a[j]==a[0])
                    count++;
                if(a[j]==a[x-1])
                    count1++;
            }
              if(a[0] - a[x-1]==0){
                long ways = x * (x - 1) / 2;
                System.out.println(ways);

            }
              else{
            System.out.println(count*count1);}



        }


    }
}
