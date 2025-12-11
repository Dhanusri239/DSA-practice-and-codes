import java.util.*;
public class containduplicate2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean r=f(a,k);
        System.out.println(r);
    }
    public static boolean f(int a[],int k){
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(m.containsKey(a[i])){
                int p=m.get(a[i]);
                if(i-p<=k)return true;
            }
            m.put(a[i],i);
        }
        return false;
    }

}