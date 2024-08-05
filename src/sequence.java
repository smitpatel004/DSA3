import java.util.*;

public class sequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();

            int a[] = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();

            }
            ArrayList<Integer> b = new ArrayList<>();
            b.add(a[0]);
//            System.out.println(n);

            for (int j = 1; j < n; j++) {
                if(a[j]>=a[j-1]){
                    b.add(a[j]);
                }
                else{
                    b.add(a[j]);
                    b.add(a[j]);
                }

            }
            System.out.println(b.size());
            for(int num : b){
                System.out.println(num);

            }




        }
    }
}

