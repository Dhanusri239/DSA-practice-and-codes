import java.util.*;
public class trappingrainwater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int r=f(h);
        System.out.print(r);
    }
    public static int f(int h[]){
        int l=0,r=h.length-1;
        int lm=h[0],rm=h[r];
        int t=0;
        while(l<r){
            if(h[l]<h[r]){
                lm=Math.max(lm,h[l]);
                if(lm-h[l]>0){
                    t+=lm-h[l];
                }
                l++;
            }
            else{
                rm=Math.max(rm,h[r]);
                if(rm-h[r]>0){
                    t+=rm-h[r];
                }
                r--;
            }
          
        }
        return t;
    }
}
