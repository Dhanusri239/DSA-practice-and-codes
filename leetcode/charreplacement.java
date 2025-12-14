import java.util.*;
public class charreplacement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int r=f(s,k);
        System.out.println(r);
    }
    public static int f(String s,int k){
        int a[]=new int[26];
        int l=0;
        int r=0;
        int m=0;
        int ans=0;
        for(;r<s.length();r++){
            m=Math.max(m,++a[s.charAt(r)-'A']);
            if(r-l+1-m>k){
                a[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
