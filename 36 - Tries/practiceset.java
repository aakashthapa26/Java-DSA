// // 1. groupAnagrams Together
// import java.util.*;
// public class practiceset {

//     static ArrayList<ArrayList<String>> groupAnagrams(String[] strs){
//         Map<Map<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();

//         for(String str: strs){
//             Map<Character, Integer> fmap = new HashMap<>();
//             for(int i=0; i<str.length(); i++){
//                 char ch = str.charAt(i);
//                 fmap.put(ch, fmap.getOrDefault(ch, 0)+1);
//             }

//             if(bmap.containsKey(fmap)==false){
//                 ArrayList<String> list = new ArrayList<>();
//                 list.add(str);
//                 bmap.put(fmap, list);
//             }
//             else{
//                 ArrayList<String> list = bmap.get(fmap);
//                 list.add(str);
//             }
//         }

//         ArrayList<ArrayList<String>> res = new ArrayList<>();
//         for(ArrayList<String> val: bmap.values()){
//             res.add(val);
//         }
//         return res;
//     }
//     public static void main(String args[]){
//         String strs[] = {"eat","tea","tan","ate","nat","bat"};

//         System.out.println(groupAnagrams(strs));
//     }
// }


// // 2. Longest Word 

public class practiceset{
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    static String ans = "";
    static String LongestWord(Node root, StringBuilder temp){
        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
            }
        }
        return ans;
    }

public static void main(String args[]){

    String words[] = {"w","wo","wor","worl","world"};

    for(int i=0; i<words.length; i++){
        insert(words[i]);
    }

    System.out.println(LongestWord(root, ""));
}
}