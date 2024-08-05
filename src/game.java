import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int level = sc.nextInt();
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i =0;i<n;i++){
            int k = sc.nextInt();
            a[i]=k;
        }
        int m = sc.nextInt();
        int b[]=new int[m];
        for(int i =0;i<m;i++){
            int k = sc.nextInt();
            b[i]=k;
        }
        for(int i=0;i<n;i++){
            if(a[i]==level){
               count++;
            }
        }
        for(int i=0;i<m;i++){
            if(b[i]==level){
                count++;
            }
        }
        if(count>0&&level<100){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
//        System.out.println(count);


    }
}
