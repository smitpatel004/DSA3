import java.util.*;
public class Target {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();

        for (int i=0 ;i<x;i++){
            char s[][] = new char[10][10];
            for(int j=0 ; j<10;j++){
                for(int l=0 ;l<10;l++){
                    s[j][l] = (char) sc.nextDouble();
                }
            }
            for(int j=0 ; j<10;j++){
                for(int l=0 ;l<10;l++){
                    System.out.println(s[j][l]);
                }
            }


        }

    }
}
