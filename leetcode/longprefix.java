import java.util.*;
public class longprefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String s=f(arr);
        System.out.println(s);
    }
    public static String f(String arr[]){
        String p=arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(p)!=0){
                p=p.substring(0,p.length()-1);
                if(p.isEmpty())return "";
            }
        }
        return p;
    }
}
