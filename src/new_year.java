import  java.util.Scanner;
public class new_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++) {
            int hour = sc.nextInt();
            int min = sc.nextInt();
            int h1 = hour*60;
           int ans=h1+min;
            int ans2=1440-ans;

            System.out.println(ans2);
        }
    }
}
