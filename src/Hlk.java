import java.util.Scanner;

public class Hlk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        if(x==1){
            System.out.println("I hate it");
        }
        else{
            if(x==2){
                System.out.println("I hate that I love it");
            }
            else {
                for (int i = 1; i < x; i++) {
                    if (i % 2 != 0) {
                        System.out.print("I hate that ");
                    } else {
                        System.out.print("I love that ");
                    }
                }
                if(x%2!=0){
                    System.out.print("I hate it");
                }
                else{
                    System.out.print("I love it");
                }
            }

        }

    }
}
