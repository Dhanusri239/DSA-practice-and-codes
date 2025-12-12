
import java.util.*;
public class anagram {
    public static boolean f(String s,String t){
        if(s.length()!=t.length())return false;
            int a[]=new int[26];
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)-'a']++;
                a[t.charAt(i)-'a']--;
            }
            for(int c:a){
                if(c!=0)return false;
            }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        boolean r=f(s,t);
        System.out.println(r);
    }
}

