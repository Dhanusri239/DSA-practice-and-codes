import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char s[]=str.toCharArray();
        m(s);
    }
    public static void m(char s[]){
        StringBuilder sb=new StringBuilder(new String(s));
        sb.reverse();
        char t[]=sb.toString().toCharArray();
        for(int i=0;i<s.length;i++){
            s[i]=t[i];
        }
        System.out.print(Arrays.toString(s));
    }
}
