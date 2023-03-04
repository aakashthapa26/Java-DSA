// Optimized approach of question 9:

// Time Complexity - O(logn)

// public class ques10 {
//     public static int optimizedPower(int a, int n){
//         if(n == 0){
//             return 1;
//         }
//         int halfPower = optimizedPower(a, n/2);
//         int halfPowerSq = halfPower * halfPower;

//         // n is odd
//         if(n % 2 != 0){
//             halfPowerSq = a * halfPowerSq;
//         }

//         return halfPowerSq;
//     }
//     public static void main(String args[]){
//         int a = 2;
//         int n = 5;
//         System.out.println(optimizedPower(a, n));
//     }
// }     



public class ques10 {
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = power(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        

        return halfPowerSq;
    }
public static void main(String args[]){
    System.out.print(power(5,2));

}   

}  