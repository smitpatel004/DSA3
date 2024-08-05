import java.util.Scanner;
public class marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        for(int i=0;i<x;i++){
            int count=0;
            int x1= sc.nextInt();
            int x2= sc.nextInt();
            int x3= sc.nextInt();
            int x4= sc.nextInt();
            if(x1<x2){count++;}
            if(x1<x3){count++;}
            if(x1<x4){count++;}
            System.out.println(count);
        }

    }
}
