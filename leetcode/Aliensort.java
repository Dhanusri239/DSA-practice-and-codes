import java.util.*;
public class Aliensort {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String order=sc.nextLine();
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        boolean r=f(s,order);
        System.out.println(r);
    }
    public static boolean f(String s[],String order){
        Map<Character,Integer>m=new HashMap<>();
        for(int i=0;i<order.length();i++){
            m.put(order.charAt(i),i);
        }
        for(int i=0;i<s.length-1;i++){
            for(int j=0;j<s[i].length();j++){
                if(j>=s[i+1].length()){
                    return false;
                }
                if(s[i].charAt(j)!=s[i+1].charAt(j)){
                   int c=m.get(s[i].charAt(j)); 
                   int n=m.get(s[i+1].charAt(j)); 
                   if(c>n){
                    return false;
                   }
                   else{
                    break;
                   }
                }
            }
        }
        return true;
    }
}
