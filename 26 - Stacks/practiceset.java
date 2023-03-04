// // 1.
// import java.util.*;
// public class practiceset {
//     class Node{
//         int data;
//         Node ptr;
//         Node(int d){
//             data = d;
//             ptr = null;
//         }
//     }

//     static boolean isPalindrome(Node head){
//         Node slow = head;
//         boolean isPalin = true;
//         Stack<Integer> s = new Stack<>();

//         while(slow != null){
//             s.push(slow.data);
//             slow = slow.ptr;
//         }

//         while(head!=null){
//             int i=stack.pop();
//             if(head.data == i){
//                 isPalin = true;
//             }
//             else{
//                 isPalin = false;
//                 break;
//             }
//             head = head.ptr;
//         }
//         return isPalin;
//     }

//     public static void main(String args[]){
//         Node one = new Node(1);
//         Node two = new Node(2);
//         Node three = new Node(3);
//         Node four = new Node(4);
//         Node five = new Node(3);
//         Node six = new Node(2);
//         Node seven = new Node(1);
//         one.ptr = two;
//         two.ptr = three;
//         three.ptr = four;
//         four.ptr = five;
//         five.ptr = six;
//         six.ptr = seven;
//         boolean condition = isPalindrome(one);;
//         System.out.println("Palindrome:"+condition);
//     }

// }



// 3. Decode a String

// public class practiceset { 
//     public Static String decodeString(String s){
//         Stack<Integer> counts = new Stack<>();
//         Stack<String> results = new Stack<>();
//         String res = "";
//         int index = 0;


//         while(index < s.length()){
//             if(character.isDigit(s.charAt(index))){
//                 int count = 0;
//                 while (character.isDigit(s.charAt(index))){
//                     count = 10 * count + (s.charAt(index)-'0');
//                     index += 1;

//                 }
//                 counts.push(count);
//             }
//             else if(s.charAt(index) == '['){
//               result.push(res);
//               res = "";
//               index+=1;  
//             }
//             else if(s.charAt(index) == ']'){
//                 StringBuffer sb = new StringBuffer(result.pop());
//                 int count = counts.pop();
//                 for(int i=0; i<count; i++){
//                     sb.append(res);
//                 }
//                 res = sb.toString();
//                 index += 1;
//             }
//             else{
//                 res += s.charAt(index);
//                 index+=1;
//             }
//         }
//         return res.toString();
//     }
// public static void main(String args[]){
//     String str = "3[a]2[bc]";
//     System.out.println(decodeString(str)); 

// }

// }




// 4.

import java.util.*;

import Imp_of_Stack.Stack;
public class practiceset {
    public static int maxWater(int[] height){
        Stack<Integer> s = new Stack<>();
        int n = height.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && (height[stack.peek()]<height[i])){
                int pop_height = height[Stack.peek()];
                stack.pop();
            }
        }
    }
public static void main(String args[]){
    int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 6};

}

}