// public class b {
//     public static void main(String args[]){
//         String st = "abcd";
//         String str = new String(st);
//         System.out.println(str);
//     }
// }


// 1. input

// import java.util.*;
// public class b {
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
// //    String name = sc.next();  // for full name excludes space also
//    String name1 = sc.nextLine();  // for Full name includes space also

//    System.out.print("Your String is : "+ name1);
// }    

// }    

  

// 2. check the length of String

// public class b {
// public static void main(String args[]){
//    String name = "Aakash Thapa";   
   
//    System.out.print(name.length());
// }

// }



// 3. How to Concatenate(add) 2 Strings

// import java.util.*;
// public class b {
// public static void main(String args[]){
//     // Scanner sc = new Scanner(System.in);  

//     String st1 = new Scanner(System.in).nextLine();
//     String st2 = new Scanner(System.in).nextLine();

//     System.out.print("String after concatenating is: "+st1+" "+st2);
// }

// }



//4. How to make String with adding each characters

// public class b {
//     public static void printLetter(String st){
//         for(int i=0; i<st.length(); i++){
//             System.out.print(st.charAt(i)+" ");
//         }
//     }
// public static void main(String args[]){
//    String st = "Aakash Thapa";
// //    System.out.println(st.charAt(0));    
//     printLetter(st);
// }
// }



// 5. Check whether is String a Palindrome or not ?

// public class b {
//     public static boolean Palindrome(String st){
//         for(int i=0; i<st.length()/2; i++){
//             if(st.charAt(i) != st.charAt(st.length()-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
// public static void main(String args[]){
//     String st = "ara";
//     if(Palindrome(st) == false){
//         System.out.println(st+" is not a Palindrome");
//     }
//     else{
//         System.out.println(st+" is a Palindrome");
//     }  
// }   
// }



// 6. Calculating distance from Origin. 

// public class b {
//     public static float Shortestdistance(String st){
//         int x=0;
//         int y=0;

//         for(int i=0; i<st.length(); i++){
//             if(st.charAt(i) == 'N'){
//                 y++;
//             }
//             if(st.charAt(i) == 'S'){
//                 y--;
//             }
//             if(st.charAt(i) == 'E'){
//                 x++;
//             }
//             if(st.charAt(i) == 'W'){
//                 x--;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2+Y2);
//     }
// public static void main(String args[]){
//     String st = "WNEENES"; 
//     System.out.println("Shortest distance between points from origin is: "+Shortestdistance(st)+"m");   
// }
// }         



// 7. Equality check in String

// public class b {
// public static void main(String args[]){
//    String st1 = "Aak";
//    String st2 = "Aak";
//    String st3 = new String("Aak");
   
//    if(st1 == st2){
//     System.out.println("Strings are equal");
//    }

//    if(st2 == st3){   
//     System.out.println("Strings are equal");
// }
// else{
//     System.out.println("Strings are not equal");
// }
  
//    if(st1.equals(st3)){
//     System.out.println("Strings are equal");
//    }
// }

// }



// 8. Print a Substring 

// public class b {
//     public static String SubString(String st, int si, int ei){
//         String substr = "";
//         for(int i=si; i<=ei; i++){
//             substr += st.charAt(i);
//         }
//         return substr;
//     }
// public static void main(String args[]){
//    String st = "Elon Musk";    
//    int si = 1;
//    int ei = 5;
//    System.out.print("Substring is : "+SubString(st, si, ei));
// }
// }



// 9. Use of compareTo

// public class b {
// public static void main(String args[]){
//    String fruits[] = {"apple", "mango", "bananna"};
   
//    String Largest = fruits[0];
//    for(int i=0; i<fruits.length; i++){
//       if(Largest.compareTo(fruits[i])<0){
//          Largest = fruits[i];
//    }
// }
//     System.out.print("Largest String is: "+Largest);
// }
// }
 

// 10. Use of StringBuffer

// public class b {
// public static void main(String args[]){
//    StringBuffer str = new StringBuffer("");
   
//    for(char ch='a'; ch<='e'; ch++){
//         str.append(ch);
//    }

//    System.out.println(str);
//    System.out.println(str.length());

// }

// }



// 11. Change lowercase to Uppercase

public class b {
    public static String toUppercase(String str){
        StringBuffer sb = new StringBuffer("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }     
            else{ 
                sb.append(str.charAt(i));
            }
        } 

        return sb.toString();   
    }
public static void main(String args[]){
   String str = "elon musk";
   System.out.println(toUppercase(str));
}
}   



// 12. Conversion lowercase to UpperCase
// public class b {
//     public static String toUppercase(String str){
//         StringBuffer sb = new StringBuffer("");
        
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1; i<str.length(); i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
// public static void main(String args[]){
//     String str = "i am an entrepreneur and an tech guy";    
//     System.out.println(toUppercase(str));
// }
// }



// 13. String Compression (ordinary Method)

// public class b {
//     public static String Compress(String str){
//         String newstr = "";
//         for(int i=0; i<str.length(); i++){
//             Integer count = 1;
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newstr += str.charAt(i);
//             if(count>1){
//                 newstr += count.toString();
//             }
//         }
//         return newstr;
//     }
// public static void main(String args[]){
//    String str = "aaabbcccdd";     
//    System.out.println(Compress(str));    
// }

// }


// 14. String Compression(By using StringBuilder)

// public class b {
//     public static String Compress(String str){
//         StringBuffer sb = new StringBuffer("");
//         for(int i=0; i<str.length(); i++){
//             Integer count =1;
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if(count>1){
//                 sb.append(count.toString());
//             }
//         }
//         return sb.toString();
//     }
// public static void main(String args[]){
//    String str = "aaabbcccdd"; 
//    System.out.println(Compress(str));
// }
// }



// *************************************************************************************** Practice Questions.

// 1.
// import java.util.*;

// public class b {
//     public static int CountLowercase(String str){
//         int count = 0;
//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == '0' || str.charAt(i) == 'u'){
//                 count++;
//             }
//         }
//         return count;
//     }
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
   
//    String str = sc.nextLine();
//    System.out.println(CountLowercase(str));  
// }   
// }  



// Extra Question: Count Lowercase in String

// public class b {
//     public static int count(String str){
//         int count =0;
//         for(int i=0; i<str.length(); i++){
//             if(i<str.length()-1 && str.charAt(i) == Character.toLowerCase(str.charAt(i))){
//                 count++;
//             }
//         }
//         return count;
//     }
// public static void main(String args[]){
//    String str = "elon Musk";     
//    System.out.println(count(str));
// }
// }
   
   

// 2. 

// public class b {
// public static void main(String args[]){
//    String str = "Hi, I am Aakash Thapa";
//    String str2 = "And I am a entrepreneur and a tech guy";
//    String str3 = "And I am going to setup my business soon";

//    System.out.println(str.equals(str2) + " "+ str2.equals(str3));
        
// }

// }


// 3. Replace character in a String

// public class b {
// public static void main(String args[]){
//     String str = "Elon Musk".replace(str.charAt(0), 'A');
//     System.out.println(str);  

// }

// }



// 4. Two strings contains same character but in a different ways.
// import java.util.Arrays;
// public class b {
//     public static void check(String str1, String st2){
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();

//         // case 1: 
//         if(str1.length() == str2.length()){

//             char str1charArray[] = str1.toCharArray();
//             char str2charArray[] = str2.toCharArray();

//             Arrays.sort(str1charArray);
//             Arrays.sort(str2charArray);

//             boolean result = Arrays.equals(str1charArray, str2charArray);
//             if(result){
//                 System.out.println("They are angrams to each other.");
//             }
//             else{
//                 System.out.println("They are not angrams to each other.");
//             }
//         }
//         else{
//             System.out.println("They are not angrams to each other.");
//         }
//     }
// public static void main(String args[]){
//    String str1 = "elon MUSK";
//    String str2 = "muks onle";
//    check(str1, str2);

// }

// }