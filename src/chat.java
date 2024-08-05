import java.util.*;

public class chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Arrays.sort(a);

            boolean valid = false;
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            // Try to find valid partition
            for (int k = 1; k < n; k++) {
                b.clear();
                c.clear();
                for (int j = 0; j < k; j++) {
                    b.add(a[j]);
                }
                for (int j = k; j < n; j++) {
                    c.add(a[j]);
                }

                valid = true;
                for (int x : b) {
                    for (int y : c) {
                        if (y % x == 0) {
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) break;
                }

                if (valid && b.size() > 0 && c.size() > 0) {
                    break;
                }
            }

            if (valid && b.size() > 0 && c.size() > 0) {
                System.out.println(b.size() + " " + c.size());
                for (int num : b) {
                    System.out.print(num + " ");
                }
                System.out.println();
                for (int num : c) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
