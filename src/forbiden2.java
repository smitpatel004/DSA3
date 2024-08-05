import java.util.Scanner;


public class forbiden2 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
        for(int i = 0;i<t;i++)
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        if(k==1){
            System.out.println("NO");
        }
        else{
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int j=0;j<n;j++){
                    System.out.println(1);
                }
            }
            else{
                if(n%2==0){
                    System.out.println("YES");
                    System.out.println(n/2);
                    for(int p=0;p<n/2;p++){
                        System.out.println(2);
                    }
                }
                else{
                    if(k==2){
                        System.out.println("NO");
                    }
                    else{
                        System.out.println("YES");
                        System.out.println(((n-3)/2)+1);
                        System.out.println(3);
                        for(int j =0 ; j<(n-3)/2;j++){
                            System.out.println(2);
                        }
                    }
                }
            }
        }

    }
}
}