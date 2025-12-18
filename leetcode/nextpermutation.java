import java.util.*;
public class nextpermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        f(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void f(int a[]){
        int i=a.length-2;
        while(i>=0 && a[i+1]<=a[i]){
            i--;
        }
        if(i>=0){
            int j=a.length-1;
            while(a[j]<=a[i]){
                j--;
            }
            swap(a,j,i);
        }
        reverse(a,i+1);

    }
    public static void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void reverse(int a[],int i){
        int j=a.length-1;
        while(i<j){
            swap(a,j,i);
            i++;
            j--;
        }
    }
}