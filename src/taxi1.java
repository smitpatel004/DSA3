import java.util.Scanner;

public class taxi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = {0,0,0,0,0};
        int taxi=0;

for(int i =0 ; i<n;i++){
        int j= sc.nextInt();
        a[j]++;
}

     //   for(int i =0 ; i<n;i++){
//          System.out.println(a[i]);
//        }

      taxi=a[4];
     taxi = taxi +a[3];
     a[1] = a[1] - a[3];
     if(a[1]<0){
         a[1] =0;
     }
     taxi = taxi +a[2]/2;
     if(a[2]%2==0){
         a[2] =0;
     }
     else{
         a[2]=1;
     }
     a[1] = a[1]+a[2]*2;
     if(a[1]%4==0){
         taxi = taxi+a[1]/4;
     }
     else{
         taxi = taxi+a[1]/4 +1;
     }
        System.out.println(taxi);



    }
}
