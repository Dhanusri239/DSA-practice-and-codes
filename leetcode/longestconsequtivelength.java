import java.util.*;
public class longestconsequtivelength {
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
}
