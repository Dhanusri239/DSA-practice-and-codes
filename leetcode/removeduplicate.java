import java.util.*;;
public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=f(arr);
        System.out.print(r);
    }
    public static int f(int arr[]){
        int in=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[in]=arr[i];
                in++;
            }
        }
        return in;
    }
}
