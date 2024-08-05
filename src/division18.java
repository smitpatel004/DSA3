import java.util.Scanner;

import static java.lang.Math.abs;

public class division18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            int m =sc.nextInt();
            if(m<1399){
                System.out.println("Division 4");}
            else if(1600<=m && m<=1899){
                System.out.println("Division 2");
            }
            else if(1900<=m){
                System.out.println("Division 1");
            }else if(1400<=m && m<=1599){
                System.out.println("Division 3");
            }




        }

    }
}
