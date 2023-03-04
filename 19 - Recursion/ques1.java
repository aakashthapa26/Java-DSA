// Print numbers from n to 1. (Decreasing Order)

import java.util.*;
public class ques1 {
    public static void numDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n+" "); 
            numDec(n-1);
        }
    }
public static void main(String args[]){
   System.out.print("Enter the value of n: ");     
   int n = new Scanner(System.in).nextInt();
   numDec(n);

}

}   