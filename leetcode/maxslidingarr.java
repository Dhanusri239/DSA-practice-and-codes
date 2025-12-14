import java.util.*;
public class maxslidingarr {
    public static int[] f(int nums[],int k){
        if(nums==null || nums.length==1 || k<=1)return new int[0];
        int n=nums.length;
        int ans[]=new int[n-k+1];
        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            while(!d.isEmpty() && d.peek()<i-k+1){
                d.poll();
            }
            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.pollLast();
            }
            d.offer(i);
            if(i>=k-1){
                ans[i-k+1]=nums[d.peek()];
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int r[]=f(nums,k);
        System.out.println(Arrays.toString(r));
    }
}
