import java.util.*;
public class uniquecharacter {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int r=f(s);
    if(r==-1){
      System.out.println("No unique character");
    } else {
      System.out.println("First unique character is "+s.charAt(r));
    }
  }
  publc static int f(String s){
      int freq[] =new int[26];
        for(int i=0;i<s.length();i++){
              freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
  }
}
