import java.util.Scanner;
public class meg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][]=new int[n][2];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
            int k=sc.nextInt();
            a[i][j]=k;
        }}
        for(int i=0;i<n-1;i++){
            for(int j=0;j<1;j++){
                if(a[i][j+1]==a[i+1][j]){
                    count++;
                }

            }}
        System.out.println(count+1);

    }
}
