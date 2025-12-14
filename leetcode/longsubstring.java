import java.util.*;
public class longsubstring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int r=f(s);
        System.out.println(r);
    }
    public static int f(String s){
        int l=0;
        int r=0;
        int ans=0;
        Set<Character>se=new HashSet<>();
        while(r<s.length()){
            char c=s.charAt(r);
            while(se.contains(c)){
                se.remove(s.charAt(l));
                l++;
            }
            se.add(c);
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
