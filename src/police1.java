import java.util.Scanner;
public class police1 {
    public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
   int x = sc.nextInt();
   int count1=0;
   int count2=0;
   int count3=0;
   int arr[] = new int[x];
   for(int i=0;i<x;i++){
       int n = sc.nextInt();
       arr[i]=n;
   }
        for(int i=0;i<x;i++){
            if(arr[i]==-1){
                if(count1>0){
                    count1--;
                }

                else{
                    count3++;
                }
            }
            else{
               for(int j=0;j<arr[i];j++){
                   count1++;
               }

            }


        }
        System.out.println(count3);

    }
}
