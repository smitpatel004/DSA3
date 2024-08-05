import java.util.Scanner;

public class color18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int w=s.length();
        int count=0;
    for(char e: s.toCharArray()){
        w--;
       if(e == s.charAt(w)){
           count++;
       }

    }
    if(count==s.length()){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }
}
