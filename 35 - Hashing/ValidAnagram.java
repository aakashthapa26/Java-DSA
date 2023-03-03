import java.util.*;
public class ValidAnagram{
  public static boolean isAnagram(String s, String t){
    if(s.length() != t.length()){
      System.out.println("Not Anagrams");
      return false;
    }
    HashMap<Character, Integer> map = new HashMap<>();

    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);

        map.put(ch, map.getOrDefault(ch, 0)+1);
    }

    for(int i=0; i<t.length(); i++){
      char ch = t.charAt(i);
      if(map.get(ch) != null ){
        if(map.get(ch) == 1){
           map.remove(ch);
        }
        else{
          map.put(ch,map.get(ch)-1);
        }
      }
      else{
        System.out.println("Not Anagrams");
        return false;
      }
    }
    System.out.println("Anagrams");
    return map.isEmpty();
  }
  public static void main(String args[]){
    String s = "anag";
    String t = "gaaJ";

    isAnagram(s, t);
}
}
