import java.util.*;
public class arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int l = 0; l < n; l++) {

            int count=0;
            int count1=0;
            int count2=0;
            int count3=0;
            int count4=0;
            Character a[][] = new Character[10][10];
            for (int i = 0; i < 10 ; i++) {
                for(int j=0;j<10;j++){
                a[i][j] = (char) sc.nextDouble();
            }}
            for (int i = 0; i < 10 ; i++) {
                for(int j=0;j<10;j++){
                   if(i==0 ||i==9 ||j==0 ||j==9){
                       if(a[i][j]!='.'){
                       count++;}
                   }
                   else if(i==1 || i==8 || j==1 || j==8){
                       if(a[i][j]!='.'){
                           count1++;}

                    }
                   else if(i==2 || i==7 || j==2 || j==7){
                       if(a[i][j]!='.'){
                           count2++;}

                   }
                   else if(i==3 || i==6 || j==3 || j==6){
                       if(a[i][j]!='.'){
                           count3++;}

                   } else if(i==4 || i==5 || j==4 || j==5){
                       if(a[i][j]!='.'){
                           count4++;}
                      }

                }}
            System.out.println((1*count) +(2*count1) +(3*count2) +(4*count3)+(5*count4));


        }
    }
}
