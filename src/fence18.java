import java.util.Scanner;
public class fence18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int last=0;
        for(int i=0;i<n;i++){
            int k1 = sc.nextInt();

                if(k1<=k){
                    last=last+1;
                }
                else{
                    last=last+2;
                }

        }
        System.out.println(last);
    }
}
