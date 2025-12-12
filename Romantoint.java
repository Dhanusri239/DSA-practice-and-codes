import java.util.*;
public class Romantoint {
    static Map<String,Integer>m=new HashMap<>();
    static{
            m.put("I",1);
            m.put("V",5);
            m.put("X",10);
            m.put("L",50);
            m.put("C",100);
            m.put("D",500);
            m.put("M",1000);
            m.put("IV",4);
            m.put("IX",9);
            m.put("XL",40);
            m.put("XC",90);
            m.put("CD",400);
            m.put("CM",900);
        }
        public static int f(String s){
            int sum=0;
            int i=0;
            while(i<s.length()){
                if(i<s.length()-1){
                    String t=s.substring(i,i+2);
                    if(m.containsKey(t)){
                        sum+=m.get(t);
                        i+=2;
                        continue;
                    }

                }
                String o=s.substring(i,i+1);
                sum+=m.get(o);
                 i+=1;
            }
            return sum;
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            int r=f(s);
            System.out.println(r);
            sc.close();
        }
    
}
