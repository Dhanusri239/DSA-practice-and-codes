import java.util.*;
public class groupanagrams {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        List<List<String>> r= f(s);
        System.out.println(r); 
    }
    public static List<List<String>> f(String []s){
        if(s.length==0)return new ArrayList<>();
        Map<String,List<String>> m=new HashMap<>();
        int co[]=new int[26];
        for(String str:s ){
            Arrays.fill(co,0);
            for(char c:str.toCharArray()){
                co[c-'a']++;
            }
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<26;i++){
                sb.append("=");
                sb.append(co[i]);
            }
            String k=sb.toString();
            if(!m.containsKey(k)){
                m.put(k,new ArrayList<String>());
            }
            m.get(k).add(str);
        }
        return new ArrayList<>(m.values());
    }
}
