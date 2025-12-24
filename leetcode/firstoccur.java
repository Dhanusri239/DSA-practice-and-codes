import java.util.*;
public class firstoccur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int r= m(s,t);
        System.out.println(r);
    }
    public static int m(String s,String t) {
     if (t.length() == 0) return 0;

    for (int i = 0; i <= s.length() - t.length(); i++) {
        int j = 0;

        while (j < t.length() &&
               s.charAt(i + j) == t.charAt(j)) {
            j++;
        }

        if (j == t.length()) {
            return i; 
        }
    }
    return -1;
        
    }
   
}
