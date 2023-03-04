// 1. PushAtBottom Method

// import java.util.*;
// public class a{
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }

//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushAtBottom(s, 4);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
// }



// 2. Reverse a String using Stack

// import java.util.*;
// public class a {
//     public static String reverseString(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++){
//             s.push(str.charAt(i));
//         }

//         StringBuffer result = new StringBuffer("");
//         while(!s.isEmpty()){
//             char ch = s.pop();
//             result.append(ch);
//         }
//         return result.toString();
//     }
// public static void main(String args[]){
//    String str = "abcd";   
//    System.out.println("Reverse String is: "+reverseString(str));  

// }

// }



// 3. Reverse a Stack

// import java.util.*;
// public class a {
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);

//     }
//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);

//     }

//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
// public static void main(String args[]){
//    Stack<Integer> s = new Stack<>();
//    s.push(1);     
//    s.push(2);     
//    s.push(3);     
//    s.push(4);     

// //    printStack(s);
//    reverseStack(s);
//    printStack(s);

// }

// }



// 5. Next Greater Right

import java.util.*;
public class a {
public static void main(String args[]){
    int arr[] = {6, 8, 0, 1, 3};
   Stack<Integer> s= new Stack<>();
   int nextGreater[] = new int[arr.length];

   for(int i=arr.length-1; i>=0; i--){
       while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        s.pop();
       }

       if(s.isEmpty()){
         nextGreater[i] = -1;
       }

       else{
        nextGreater[i] = arr[s.peek()];
       }

       s.push(i);
   }

   for(int i=0; i<nextGreater.length; i++){
    System.out.print(nextGreater[i]+" ");
   }

}

}