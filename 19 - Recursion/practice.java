// // 1.

// public class practice {
//     public static void allOccurence(int arr[], int i, int key){
//         if(i == arr.length){
//             return;
//         }

//         if(arr[i] == key){
//             System.out.print(i+" ");
//         }
//         allOccurence(arr, i+1, key);
//     }
//     public static void main(String args[]){  
//         int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int key = 2;
//         allOccurence(arr, 0, key);
//     }
// }



// // 2.

// public class practice {
//     static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

//     public static void printDigits(int number) {
//         if(number == 0){
//             return;
//         }

//         int lastDigit = number%10;
//         printDigits(number/10);
//         System.out.print(digits[lastDigit]+" ");
//     }
// public static void main(String args[]){
//     printDigits(1234); 

// }

// }



// 3.

// public class practice {
//     public static int length(String str){
//        if(str.length() == 0){
//             return 0;
//        } 

//        return length(str.substring(1)) + 1;
//     }
// public static void main(String args[]){
//     System.out.print(length("aakash"));
// } 
// }   



// // 4.

// public class practice {
//     public static int countSubstrs(String str, int i, int j, int n){
//         if(n == 1){
//             return 1;
//         }

//         if(n <= 0){
//             return 0;
//         }

//         int res = countSubstrs(str, i+1, j, n-1) + 
//                   countSubstrs(str, i, j-1, n-1) - 
//                   countSubstrs(str, i+1, j-1, n-2);

//         if(str.charAt(i) == str.charAt(j)){
//             res++;
//         }
//         return res;
//     }
// public static void main(String args[]){
//    String str = "abcab";
//    int n = str.length();
//    System.out.print(countSubstrs(str, 0, n-1, n));

// }

// }    




// 5. TOWER OF HANOI(important)

public class practice {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n + " from " + src + " to "+ dest);
            return;
        }

        // transfer top n-1 from src to helper using dest as 'helper'
        System.out.println("transfer disk "+ n + " from " +src+" to "+dest);
        towerOfHanoi(n-1, src, dest, helper);
        towerOfHanoi(n-1, helper, src, dest);
    }
public static void main(String args[]){    
    int n = 2;
    towerOfHanoi(n,"S","H", "D");
        

}

}
  
