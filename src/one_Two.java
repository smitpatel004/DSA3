import java.util.*;
public class one_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int l = 0; l < k; l++) {
            int x = sc.nextInt();
            int a[] = new int[x];
            int count = 1;
            int count1 = 0;
            int count2=0;
            int count3=0;
            int sum =1;
            int p=0;
            for (int i = 0; i < x; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < x; i++) {
               count =count*a[i];
               if(a[i]==1)count1++;
               if(a[i]==2)count2++;

            }
//            System.out.println(count);
            for(int i=0 ; i<x;i++) {
                sum = sum * a[i];
                if( count == 2){
                    System.out.println(-1);
                    break;
                }
                else{
                    if(count1 == x){
                        System.out.println(1);
                        break;
                    }
                    else{
                        for(int o=0;o<(x/2);o++){
                            if(a[o]==2){
//                                System.out.println(a[i]);
                            count3++;
                            p=o;
                            }
                        }
//                        System.out.println(count3);
//                        System.out.println(count2);
                        if(count2 % 2==0){
                            System.out.println(p+1);
                        }
                        else if(count3 == (count2/2)){

                            System.out.println(p+1);
                            break;
                        }
                        else{
                            System.out.println(-1);
                            break;
                        }

                    }

                }

//

            }

        }
    }
}
