import java.util.Scanner;
public class sum10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            a[i]=k;
        }
        for(int i=0;i<n;i++){
          if(sum>0){
              sum=sum-a[i];
              System.out.println(sum);
          }
          else{
              sum=sum+a[i];
              System.out.println(sum);
          }

        }
        System.out.println(sum);


    }
}
