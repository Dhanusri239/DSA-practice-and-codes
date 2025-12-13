import java.util.*;
public class smallmissingpositive {
    public static int f(int nums[]){
        Arrays.sort(nums);
        TreeSet<Integer> s=new TreeSet<>();
        for(int i:nums){
            if(i>0){
                s.add(i);
            }
        }
        int p=s.first();
        for(int i:s){
            if(p==i)continue;
            if(i-p>1){
                return p+1;
            }
            else{
                p=i;
            }
        }
        return p+1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
         int r=f(nums);
         System.out.println(r);
    }
}
