import java.util.*;
public class palindromicsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int res=f(s);
        System.out.println(res);
    }

public static int f(String s){
    int a=0;
    for(int i=0;i<s.length();i++){
        a+=m(s,i,i);
        a+=m(s,i,i+1);
    }
    return a;
}
public static int m(String s,int l,int r){
    int c=0;
    while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
        l--;
        r++;
        c++;
    }
    return c;
}
}
