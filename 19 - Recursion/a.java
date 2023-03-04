// // Print numbers from n to 1. (Decreasing Order)

// import java.util.*;
// public class a {
//     public static void numDec(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         else{
//             System.out.print(n+" "); 
//             numDec(n-1);
//         }
//     }
// public static void main(String args[]){
//    System.out.print("Enter the value of n: ");     
//    int n = new Scanner(System.in).nextInt();
//    numDec(n);

// }

// }   



// // Print numbers from n to 1. (Increasing Order)

// public class a {
//     public static void printInc(int n){
//         if(n==1){
//             System.out.print(n + "  ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n+" ");
//     }
//     public static void main(String args[]){
//         int n = 5;
//         printInc(n);
//     }
// }



// public class a {
//     public static int Factorial(int n){
//         if(n == 0){
//             return 1;
//         }
//         else{
//             return n*Factorial(n-1);
//         }
//     }
//     public static void main(String args[]){
//         int n = 5;  
//         System.out.print("Factorial is: "+Factorial(n));
//     }
// }




// // Print Sum of first n natural Numbers.

// public class a {
//     public static int Calcsum(int n){
//         if(n == 1){
//             return 1;
//         }
//         return n + Calcsum(n-1);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(Calcsum(n));
//     }
// }



// //  FibonacciNumber
// public class a {
//     public static int FibonacciNumber(int np){
//         if(np == 0 || np == 1){
//             return np;
//         }
//         else{
//             return FibonacciNumber(np - 1) + FibonacciNumber(np - 2);
//         }
//     }
//     public static void main(String args[]){
//         int np = 5;
//         System.out.println("Fibonacci Number is: "+FibonacciNumber(np));
//     }         
// }            
               


// // Check if a given array is sorted or not.

// public class a {
//     public static boolean isSorted(int arr[], int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }

//         return isSorted(arr, i+1);
//     }
//     public static void main(String args[]){  
//         int arr[] = {1, 2, 3, 4};
//         System.out.println(isSorted(arr, 0));
//     }
// }




// // Write a function to find the first occurence of an element in an array.

// // Time Complexity - O(n) & Space Complexity - O(n)

// public class a {
//     public static int firstOccurence(int arr[], int key, int i){
//         // Base Case:
//         if(i == arr.length){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }

//         return firstOccurence(arr, key, i+1);

//     }
//     public static void main(String args[]){
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         int key = 5;
        
//         System.out.println("key is first occured at index "+firstOccurence(arr, key, 0));
//     }
// }



// // Write a Function to find the last occurence of an element in an array

// public class ques8 {
//     public static int lastOccurence(int arr[], int key , int i){
//         // Base Class:
//         if(i == 0){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }

//         return lastOccurence(arr, key, i-1);
//     }
//     public static void main(String args[]){
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         int key = 5;
//         int n = arr.length-1;
//         System.out.print("key from last occurence is at index "+lastOccurence(arr, key, n));
//     }
// }



// // Print x^n;

// // Time Complexity : O(n)
// public class a {
//     public static int pow(int x, int n){
//         if(n == 0){
//             return 1;
//         }

//         return (x * pow(x, n-1));
//     }
//     public static void main(String args[]){
//         int x = 2;
//         int n = 10;
//         System.out.println(pow(x,n));
//     }
// }




// // Optimized approach of question 9:

// // Time Complexity - O(logn)

// public class a {
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
   



// public class a {
//     public static int tillingProblem(int n){  // 2 x n (floor size)
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         // vertical Choice
//         int fnm1 = tillingProblem(n-1); 

//         // horizontal choice
//         int fnm2 = tillingProblem(n-2);

//         int totWays = fnm1 + fnm2;
//         return totWays;
        
//     }
//     public static void main(String args[]){
//          System.out.println(tillingProblem(5));    
//     }
// }




// // Removes Duplicates in a String

// public class a {
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
//         if(idx == str.length()){ 
//             System.out.println(newStr);
//             return;
//         }
//         // kaam
//         char currChar = str.charAt(idx);
//         if(map[currChar-'a'] == true){
//             // duplicate
//             removeDuplicates(str, idx+1, newStr, map);
//         }
//         else{
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newStr.append(currChar), map);
//         }
//     }
//     public static void main(String args[]){
//         String str = "appnnacollege"; 
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     } 
// }
 



// public class a {
//     public static int friendsPairing(int n){
//         if(n == 1 || n == 2){
//             return n;
//         }
 
//         // // choices
//         // // 1. Single
//         // int fnm1 = friendsPairing(n-1);

//         // // 2. Pair
//         // int fnm2 = friendsPairing(n-2);
//         // int pairWays = (n-1) * fnm2;

//         // // totWays
//         // int totWays = fnm1 + pairWays;
//         // return totWays;
         
//         return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
//     }
//     public static void main(String args[]){          
//         System.out.print(friendsPairing(3));      
//     }
// }     
 

 

// public class a {
//     public static void printBinStrings(int n, int lastPlace, String str){
//         // base case
//         if(n == 0){
//             System.out.println(str);
//             return;
//         }

//         // kaam

//     printBinStrings(n-1, 0, str+"0");

//     if(lastPlace == 0){
//         printBinStrings(n-1, 1, str+"1");
//     }
    
//     }
//     public static void main(String args[]){
//         printBinStrings(3, 0 , "");
//     }
// }
    



// public class a {
//     static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
//     public static void printDigits(int number){
//         if(number == 0){
//             return;
//         }

//         int lastDigit = number%10;
//         printDigits(number/10);
//         System.out.print(digits[lastDigit] + " ");
//     }
// public static void main(String args[]){
//     printDigits(1947);     
//     System.out.println();
// }

// }


