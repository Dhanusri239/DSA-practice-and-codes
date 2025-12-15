import java.util.*;
public class Minwindow {
    public static String f(String s,String t){
        if(s.length()==0 || t.length()==0 || s.length()<t.length())return "";
        Map<Character,Integer>mt=new HashMap<>();
        for(int i=0;i<t.length();i++){
            mt.put(t.charAt(i),mt.getOrDefault(t.charAt(i),0)+1);
        }
        int re=mt.size();
        int l=0;
        int r=0;
        int create=0;
        int ans[]={-1,0,0};
        Map<Character,Integer>sub=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            int count=sub.getOrDefault(c,0);
            sub.put(c,count+1);
            if(mt.containsKey(c) && sub.get(c).intValue()==mt.get(c).intValue()){
                create++;
            }
            while(l<=r && create==re){
                c=s.charAt(l);
                if(ans[0]==-1 || r-l+1<ans[0]){
                    ans[0]=r-l+1;
                    ans[1]=l;
                    ans[2]=r;
                }
                sub.put(c,sub.get(c)-1);
                if(mt.containsKey(c) && sub.get(c).intValue()<mt.get(c).intValue()){
                    create--;
                }
                l++;
            }
            r++;
        }
        if(ans[0]==-1)return "";
        return s.substring(ans[1],ans[2]+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        String re=f(s,t);
        System.out.print(re);
        sc.close();
    }
}
