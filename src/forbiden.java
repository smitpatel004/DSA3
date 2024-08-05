import java.util.*;
public class forbiden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int r =n;
            int k = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;
            int count = 0;
            int count1 = 0;
            int count3=0;
            int count4=0;
//            while (sum == 0) {
            if (x != 2 && k >= 2)  {
                if(n%2==0) {
                    while (n % 2 == 0) {
                        n = n / 2;
                        count++;
                    }
                    System.out.println("i");
                }
                }
            if (x != 3 && k >= 3)  {
                if(n%3==0){
                    while (n % 3 == 0)  {
                        n = n / 3;
                        count1++;
                    }
                    System.out.println("m");}
                }
            if (x != 5&& k >= 5)  {
                if(n%5==0){
                while (n % 5 == 0)  {
                    n = n / 5;
                    count3++;
                }
                System.out.println("j");}
            }
            if (x != 7&& k >= 7)  {
                if(n%7==0){
                while (n % 7 == 0)  {
                    n = n / 7;
                    count4++;
                }
                System.out.println("a");}
            }
            int ans =0;
            System.out.println(count);
//            System.out.println(count1);
//            System.out.println(count3);
//            System.out.println(count4);
            sum = ((count*2)+(count1*3)+(count3*5)+(count4*7));
            System.out.println(sum);
            if( k==1 && x==1){
                if(r>sum){
                ans =   r-sum;}
                else{
                    System.out.println(sum);
                    System.out.println(r);
                    ans = sum -r;
                    System.out.println(ans);
                    System.out.println("i am in ");
                }
//                System.out.println(ans);
                System.out.println("YES");
                System.out.println(sum +ans);
//                int l = count +count1+ans;
                if(count>1){
                for(int z = 0 ;z<count ;z++){
                    System.out.println(2);
                }}
                if(count1 >0){
                for(int z = 0 ;z<count1 ;z++){
                    System.out.println(3);
                }}
                if(count3 >0){
                    for(int z = 0 ;z<count3 ;z++){
                        System.out.println(5);
                    }}
                if(count4 >0){
                    for(int z = 0 ;z<count4 ;z++){
                        System.out.println(7);
                    }}
                for(int z = 0 ;z<ans ;z++){
                    System.out.println(1);
                }

            }else{
                System.out.println("NO");
            }

        }


        }
    }
//}
