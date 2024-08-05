import java.util.*;
public class next_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int a[] = new int[x];
        int count =0;
        for(int i = 0;i<x;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0;i<x;i++){
           if(a[i]!=i+1){

               break;
           }
           else{
               count++;
           }

        }
        System.out.println(count+1);
    }
}
