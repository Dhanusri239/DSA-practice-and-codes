import java.util.*;
public class wordpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String p= sc.nextLine();
        boolean r=m(p,s);
        System.out.println(r);
    }
    public static boolean m(String p,String s){
         String[] words = s.split(" ");

    if (p.length() != words.length) {
        return false;
    }

    Map<Character, String> charToWord = new HashMap<>();
    Map<String, Character> wordToChar = new HashMap<>();

    for (int i = 0; i < p.length(); i++) {
        char ch = p.charAt(i);
        String word = words[i];

        if (charToWord.containsKey(ch)) {
            if (!charToWord.get(ch).equals(word)) {
                return false;
            }
        } else {
            if (wordToChar.containsKey(word)) {
                return false;
            }
            charToWord.put(ch, word);
            wordToChar.put(word, ch);
        }
    }
    return true;
    }

    }

