import java.util.*;
public class last_length {
  public static int lof(String s){
    int c=0;
    int i=s.length()-1;
    while(i>=0 && s.charAt(i)==' '){
      i--;
    }
    while(i>=0 && s.charAt(i)!=' '){
      c++;
      i--;
    }
    return c;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int r=lof(s);
    System.out.println("Length of the last word is "+r);
  }
}
