public class a {
    static boolean isSorted(int n[], int i){
        if(i == n.length-1){
            return true;
        }
        if(n[i] > n[i+1]){
            return false;
        }

        return isSorted(n, i+1);
    }
   public static void main(String args[]){
        int n[] = {1,2,3,4,5};
        System.out.print(isSorted(n, 0));
        
   } 
}
