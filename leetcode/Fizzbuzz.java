import java.util.*;
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> r=f(n);
        System.out.print(r);
    }
    public static List<String> f(int n){
        List<String> re=new ArrayList<>();
        for(int i=1;i<=n;i++){
          if(i%3==0 && i%5==0){
            re.add("Fizzbuzz");
          }
          else if(i%3==0){
            re.add("Fizz");
          }
          else if(i%5==0){
            re.add("Buzz");
          }
          else{
            re.add(Integer.toString(i));
          }
        }
        return re;
    
}
}
