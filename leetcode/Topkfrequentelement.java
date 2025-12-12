import java.util.*;
public class Topkfrequentelement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int a[]=f(arr,k);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
    public static int []f(int []arr,int k){
        if(arr.length==k){
            return arr;
        }
        Map<Integer,Integer>m=new HashMap<>();
        for(int n:arr){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        Queue<Integer>p=new PriorityQueue<>();
        for(int n : m.keySet()){
            p.add(n);
            if(p.size()>k){
                p.poll();
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=p.poll();
        }
        return ans;
    }
}
