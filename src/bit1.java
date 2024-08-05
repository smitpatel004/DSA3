import java.util.Scanner;
public class bit1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int X = sc.nextInt();

       for(int i=0;i<X+1;i++){
           String n = sc.next();
           String mychar = String.valueOf(n.charAt(1));
           System.out.println(mychar);
//           System.out.println(n);

           if(mychar=="+"){
               X++;
           System.out.println("+");}
           else{
               X--;
           System.out.println("-");}
           }

        System.out.println(X);
    }
}
