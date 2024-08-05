import java.util.Scanner;

public class l18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int count = 0;
            int count1 = 0;

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (a[j] == -1) {
                    count++;
                }
                if(a[j]==1){
                    count1++;
                }
            }
          if(count1>=count){
              System.out.println(count%2);
          }
          else{
              int total = (count-count1+1)/2;
              count -= total;
              if(count%2!=0){
                  total++;
              }
              System.out.println(total);


          }
        }
    }
}
