import java.util.Scanner;
import java.lang.Math;
public class theater_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float x1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float a =(x/x2);
        double k = (double) Math.ceil(a);
        float b=x1/x2;
        double k1 = (double) Math.ceil(b);
        System.out.println(k*k1);

    }
}
