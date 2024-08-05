import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(sc.next());
            long m= Long.parseLong(sc.next());
            long s = Long.parseLong(sc.next());
            for (int j = 0; j < s; j++) {
                  n++;
                  while(n%m ==0){
                      if(n%m==0){
                          n=n/m;
                      }
                  }
            }
            System.out.println(n);


        }
    }
}
