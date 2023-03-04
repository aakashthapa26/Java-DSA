public class a{
    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        Node() {
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    static void insert(String word){
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
     for(; level<len; level++) {
        idx = word.charAt(level)-'a';
        if(curr.children[idx] == null){
            curr.children[idx] = new Node();
        }
        curr = curr.children[idx];
     }
     curr.eow = true;
    }

    static boolean search(String key){
        int level = 0;
        int len = key.length();
        int idx = 0;

        Node curr = root;
     for(; level<len; level++) {
        idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
            curr.children[idx] = new Node();
        }
        curr = curr.children[idx];
     }
        return curr.eow == true;
    }

    static String ans = "";
    static void Longest_Word(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
            }
            Longest_Word(root.children[i], temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
public static void main(String args[]){

    String words[] = {"a", "banana", "app", "appl", "ap",
                    "apply", "apple"};

    for(int i=0; i<words.length; i++){
        insert(words[i]);
    }

    Longest_Word(root, new StringBuilder(""));
    System.out.println(ans);

}
}
  