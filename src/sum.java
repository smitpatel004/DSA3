import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nm = sc.nextInt();
        for(int i=0;i<nm;i++){
            int n1= sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            if(n1==n2+n3 || n2==n1+n3 || n3==n1+n2){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
