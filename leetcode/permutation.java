import java.util.*;
public class permutation {
    public static boolean f(String s1,String s2){
        if(s1.length()>s2.length())return false;
        int s1m[]=new int[26];
        int s2m[]=new int[26];
        for(int i=0;i<s1.length();i++){
            s1m[s1.charAt(i)-'a']++;
            s2m[s2.charAt(i)-'a']++;

        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if(matches(s1m,s2m))return true;
            s2m[s2.charAt(i+s1.length())-'a']++;
            s2m[s2.charAt(i)-'a']--;
        }
        return matches(s1m,s2m);
    }
    public static boolean matches(int s1m[],int s2m []){
        for(int i=0;i<26;i++){
            if(s1m[i]!=s2m[i])return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean re=f(s1,s2);
        System.out.println(re);
    }
}
