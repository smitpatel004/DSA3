import java.util.Scanner;
public class pizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans1=0;
        int area=m*n;
        int choice = area % 2;
        if(area % 2 ==0){
            ans1= area /2;
            System.out.println(ans1);
        }
        else{
            ans1 = area /2;
             ans1 = ans1 +1;
            System.out.println(ans1);

        }
//switch(choice){
//    case 1: System.out.println(ans1);
//            break;
//    case 2,3:
//        ans1++;
//        System.out.println(ans1);
//        break;
//    case 4,5:
//        ans1++;
//        ans1++;
//        System.out.println(ans1);
//        break;
//    case 6,7:
//        ans1++;
//        ans1++;
//        ans1++;
//        System.out.println(ans1);
//        break;
//    case 8,9:
//        ans1++;
//        ans1++;
//        ans1++;
//        ans1++;
//        System.out.println(ans1);
//        break;
//
//
//}


    }
}
