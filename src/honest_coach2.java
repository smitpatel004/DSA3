import java.util.Scanner;
public class honest_coach2 {
    public static void main(String[] args) {
        int arr[]={1,5,0,4,3,6};
        int max=arr[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  N");
        int part = sc.nextInt();
        int min=arr[6-part];
        for(int i=0;i<6;i++){
            if(i<part){
                if(max<arr[i]){
                    max =arr[i];
                }
            }
            else{
                System.out.println("i asm in else"+i);
                if(min>arr[i]){
                    min=arr[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
        int ans = max-min;
        System.out.println(ans);


    }
}
