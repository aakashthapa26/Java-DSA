public class classroom{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false; // end of word

        Node() {
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
 
    static Node root = new Node();
public static void main(String args[]){

    String words[] = {"the", "a", "there", "their", "any", "thee"};

}
}
    