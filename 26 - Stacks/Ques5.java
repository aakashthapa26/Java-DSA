// Next Greater Right

import java.util.*;
public class Ques5 {  // Optimized T.C - O(n)
    public static void main(String args[]){
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            // 1. While loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // 2. if-else 
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()]; 
            }

            // 3. Push in stack
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
 


// Similar Forms

// next Greater Right 
// next Greater Left 
// next Smaller Right
// next Smaller left  