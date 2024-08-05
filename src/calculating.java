import java.util.*;
public class calculating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        if(x % 2 == 0){
       double k = x/2;
        double e = k*(k+1);
        double o = k*k;
            System.out.println(e-o);
        }
        else{
            double k = x/2;
            double e = k*(k+1);
            double o = (k+1)*(k+1);
            
            System.out.println((e-o));
        }


    }
}

