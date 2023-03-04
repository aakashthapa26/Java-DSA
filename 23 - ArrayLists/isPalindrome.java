import java.util.ArrayList;
public class isPalindrome {
    public static boolean Palindrome(ArrayList<Integer> ll){
        int n = ll.size();
        for(int i=0; i<ll.size()/2; i++){
            if(ll.get(i) == ll.get(n-i-1)){
                return true;
            }
        }
        return false;
    }
public static void main(String args[]){
   ArrayList<Integer> ll = new ArrayList<>();
   ll.add(2);    
   ll.add(3);    
   ll.add(2);    
   ll.add(5);    

   System.out.println(ll);
   System.out.println(Palindrome(ll));


}

}