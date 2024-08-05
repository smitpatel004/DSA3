import java.util.Scanner;
public class group {
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            int n2= sc.nextInt();
            int n3 = sc.nextInt();
            if((n1==1&&n2==1)||(n1==1&&n3==1)||(n2==1&&n3==1) ){
                count++;
            }

        }
        System.out.println(count);





    }
}
