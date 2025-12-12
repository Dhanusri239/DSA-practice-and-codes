import java.util.*;
public class longconsecutivelength {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=f(arr);
        System.out.println("Longest consective length is: "+r);
    }
    public static int f(int arr[]){
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int c=1;
        int m=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]-arr[i-1]==1){
                c++;
            }
            else{
                c=1;
            }
            m=Math.max(m,c);
        }
        return m;
    }
}
