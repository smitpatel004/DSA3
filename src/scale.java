import java.util.Scanner;

public class scale {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<x;i++){
            int n1= sc.nextInt();
            int k= sc.nextInt();
            int a[][] = new int[n1][n1];
            int o = n1/k;
            int b[][] = new int[o][o];
            for(int l=0;l<n1;l++){
                for(int j=0; j<n1;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            if(o==1){
                System.out.println(a[0][0]);
            }
            else{
                if(n1==o){
                    for(int l=0;l<n1;l++){
                        for(int j=0; j<n1;j++){
                            System.out.println(a[l][j]);
                        }
                    }
                }
                else{
//                    for(int l=0;i<o;l++){
//                        for(int j =0 ;j<o;j++){
//                            b[l][j] = a[l+k][j+k];
//                        }
//                    }

                    for(int l=0;i<o;l++){
                        for(int j =0 ;j<o;j++){
                            System.out.println(b[l][j]);
                        }
                    }

                }
            }



        }
    }
}
