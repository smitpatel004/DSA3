import java.util.Scanner;
public class yes1 {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer() ;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i=0;i<k;i++){
            String n = sc.next();
            int l= n.length();
            for(int j=0;j<l+1;j++){
                Character c =str.charAt(i);
                if(Character.isLowerCase(c)){
                    char toUppercase = (char)(c+32);
                }
            }
            System.out.println(n);
        }
    }
}
