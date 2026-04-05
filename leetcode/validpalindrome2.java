import java.util.*;
class validpalindrome2{
  public static boolean validpalindrome(String s){
    int l=0;
    int r=s.length()-1;
    while(l<r){
      if(s.charAt(l)!=s.charAt(r)){
        return ispalindrome(s,l+1,r) || ispalindrome(s,l,r-1);
      }
      l++;
      r--;
    }
    return true;
  }
  public static boolean ispalindrome(String s,int l,int r){
    while(l<r){
      if(s.charAt(l)!=s.charAt(r)){
        return false;
      }
      l++;
      r--;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
      if(validpalindrome(s)){
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    
  }
}