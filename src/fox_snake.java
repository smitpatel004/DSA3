import java.util.Scanner;

public class fox_snake {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count=1;
            int n=sc.nextInt();
            int m = sc.nextInt();
            for(int i=1;i<=n;i++){
//                for(int j=1;j<m;j++){
                    if(i%2==0){
                        for(int l=1;l<m-1;l++) {

                            if (count%2 != 0) {
                                for(int s=1;s<m;s++){
                                System.out.print(".");}
                                System.out.println("#");

                            }
                            else{
                                System.out.print("#");
                                for(int x=1;x<m;x++){
                                    System.out.print(".");}
                                System.out.println();

                            }
//                            System.out.println();
                            count++;
                            break;


                        }


//                        }
                    }
                    else{
                        for(int k=0;k<m;k++){
                        System.out.print("#");}
                        System.out.println();
                    }
                }
//            }


        }
    }


