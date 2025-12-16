import java.util.*;
public class twosum2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int re[]=f(arr,t);
        System.out.println(Arrays.toString(re));
    }
    public static int[] f(int arr[],int t){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]>t){
                r--;
            }
            else if(arr[l]+arr[r]<t){
                l++;
            }
            else{
                return new int[]{l+1,r+1};
            }
        }
        return null;

}
}
