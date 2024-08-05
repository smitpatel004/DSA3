import java.util.Scanner;

public class clocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++) {
            String s=null;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            for(int j =1 ;j<=12;j++){
                if(j==a||j==b){
                    s =s+"a";
                }
                if(j==c||j==d){
                    s=s+"b";
                }
            }

            if(s.equals("nullabab") ||s.equals("nullbaba")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
