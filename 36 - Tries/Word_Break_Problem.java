public class Word_Break_Problem{

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    static void insert(String arr){
        Node curr = root;
        for(int level = 0; level<arr.length(); level++){
            int idx = arr.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        root.eow = true;
    }

    static boolean search(String key){
        Node curr = root;
        for(int level = 0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return root.eow == true;
    }

    static boolean wordBreak(String key){  //O(L)
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
           if(search(key.substring(0,i)) 
            && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        
        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
}
}


