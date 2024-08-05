import java.util.*;
public class balanmced {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int count=1;
            int n = sc.nextInt();
            int a[] = new int[n];
            int k = sc.nextInt();
            int ans=0;
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int j=1;j<n;j++){
               if(a[j]-a[j-1]<=k){
                   count++;
               }
               else{
                   ans =Math.max(ans,count);
                   count=1;
               }

            }
            ans=Math.max(ans,count);
            System.out.println(n-ans);
        }
    }
}
