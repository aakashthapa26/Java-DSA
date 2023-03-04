// // 2.Reverse a String using a Stack

// import java.util.*;
// public class Ques2 {
    
//     public static String reverseString(String str) {
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx < str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuffer result = new StringBuffer("");
//         while(!s.isEmpty()) {
//             char curr = s.pop();
//             result.append(curr);
//         }
//         return result.toString();
//     }
//     public static void main(String args[]){
//         String str = "Hello World";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }
   



