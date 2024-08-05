import java.util.Scanner;
public class room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int a[][]=new int[n][2];
        for (int i=0;i<n;i++){
            for(int j=0;j<2;j++){

                int k= sc.nextInt();
                a[i][j]=k;

            }

        }
        for (int i=0;i<n;i++){
            for(int j=0;j<1;j++){
                if(a[i][j+1]-a[i][j]>=2){
                    c++;
//                    int aa=a[i][j+1]-a[i][j];
//                    System.out.println(aa);
                }

            }

        }
        System.out.println(c);
    }
}
