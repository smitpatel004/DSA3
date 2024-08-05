import java.util.Scanner;

public class cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0 ; i<n ;i++){
            int x=sc.nextInt();
            int d= sc.nextInt();
            if(x==d){
                System.out.println("YES");
            }
            else{

                 if((x-d)%2==0  && x>d){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
