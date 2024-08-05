// Java Program to Sort the Elements in Descending Order
import java.util.*;

// Driver Class
class GFG {
    // Main Method
    public static void main(String[] args)
    {
        // Initializing the array
//        Integer array[] = { 1, 2, 3, 4, 5 };
//
//        // Sorting the array in descending order
//
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        int array[]=new int[n];


        for(int i=0;i<n;i++){
//            System.out.println("enter val");
            int val = sc.nextInt();
            array[i]=val;
        }
//        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
}

