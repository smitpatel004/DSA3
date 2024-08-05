import java.util.Scanner;

public class blank_space{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int count = 0;
            int count1 = 0;

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (a[j] == 0)
                    count++;
                else
                    count1++;
            }
            if(count == n)
                System.out.println(count);
            else{
                if(count1 == n){
                    System.out.println(0);
                }
                else{
                    int ans =0;
                    int max=0;
                    for(int m=0;m<n;m++){
                        if(a[m]==1){
                            ans=0;
                        }
                        else{
                            if(max <=ans){
                            max =ans;}
                            ans++;
                        }
                    }
                    System.out.println(max+1);
                }
            }

        }
    }
}
