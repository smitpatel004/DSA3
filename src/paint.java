import java.util.*;

public class paint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int count=0;
            int count0 = 0;
            int count1=0;
            int n = sc.nextInt();

            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n-1; j++) {
                if(a[j]==a[j+1]){
                    count1++;
                }
                if(n%2==0){
                    if(a[j]==a[j+1]){
                        count0++;
                    }
                    else{
                        count++;
                    }
                }
            }
//            if(a[0]!=a[1]){
//                count1--;
//            }

          if(count1 == n-1 ){

              System.out.println("YES");
          }
          else{
              if(n%2==0 && (count+1) == count0){
                  System.out.println("YES");
              }
              else{
              if(count1<=1 && n<=3){

                  System.out.println("YES");
              }
              else{
                  System.out.println("NO");
              }}
          }


        }

    }
}

