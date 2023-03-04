public class ques13_FriendsPairing {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
 
        // // choices
        // // 1. Single
        // int fnm1 = friendsPairing(n-1);

        // // 2. Pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // // totWays
        // int totWays = fnm1 + pairWays;
        // return totWays;
         
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String args[]){          
        System.out.print(friendsPairing(3));      
    }
}     
 

 