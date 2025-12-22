import java.util.*;
public class longpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res=f(s);
        System.out.println(res);
    }
    public static String f(String s){
        if(s.length()<1 || s==null)return "";
        int l=0,r=0;
        for(int i=0;i<s.length();i++){
            int l1=check(s,i,i);
            int l2=check(s,i,i+1);
            int len=Math.max(l1,l2);
            if(len>r-l){
                l=i-(len-1)/2;
                r=i+len/2;
            }
        }
        return s.substring(l,r+1);
    }
    public static int check(String s,int l,int r){
        int L=l,R=r;
        while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
