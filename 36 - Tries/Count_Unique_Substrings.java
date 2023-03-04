public class Count_Unique_Substrings {
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

    static int countNodes(Node root) {
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

public static void main(String args[]){

    String str = "ababa"; //ans = 10

    //suffix -> then, insert in trie
    for(int i=0; i<str.length(); i++){
        String suffix = str.substring(i);
        insert(suffix);
    }

    System.out.println(countNodes(root));
}
}
