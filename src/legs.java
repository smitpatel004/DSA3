import java.util.Scanner;

public class legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0 ;i<x;i++){
            int n = sc.nextInt();
       int anas= n/2;
       if(anas%2==0){
           System.out.println(anas/2);
            }
       else{
           System.out.println((anas/2)+1);
       }



        }    }
}
