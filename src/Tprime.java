import java.util.Scanner;
public class Tprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int x =  sc.nextInt();
        int arr[] = new int[x];
        for(int i =0; i<x;i++)
            arr[i]= sc.nextInt();
        for (int i=0 ; i<x;i++){
            count=0;
            for(int j =1 ; j<=x;j++){
            if(arr[i]%j == 0){
                count++;
            }}
            System.out.println(count);
            if(count >2){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }

        }


    }
