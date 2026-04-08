import java.util.*;
public class reversewords3 {
  public static String reverse(String s){
    String [] w=s.split(" ");
    StringBuilder sb=new StringBuilder();
    for(String wo:w){
      StringBuilder w1=new StringBuilder(wo);
      sb.append(w1.reverse()).append(" ");
    }
    return sb.toString().trim();
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String r=reverse(s);
    System.out.println("Reversed words are "+r);
  }
}
