// 1.

// public class a {
// public static void main(String args[]){
//    char arr[] = {'a', 'b', 'c', 'd'};
//    String str = "abcd";
//    String str2 = new String("abcd");
//    // Strings are immutable(Strings cannot be changed) 
// }

// }


// 2.

// import java.util.*;

// public class a {
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
// //    String name = sc.next();
//    String name = sc.nextLine();
//    System.out.println(name);     

// }

// }


// 3.

// public class a {
// public static void main(String args[]){
//     String fullName = "Aakash Thapa";
//     System.out.println(fullName.length());    

// }

// }


// 4. (Concatenation)

// public class a {
// public static void main(String args[]){
//     String firstName = "Aakash";
//     String lastName = "Thapa";
//     String fullName = firstName + " " + lastName;
//     System.out.println(fullName);    

// }

// }


// 5.

// public class a {
//     public static void printLetters(String str){
//         for(int i=0; i<str.length(); i++){
//             System.out.print(str.charAt(i)+"");
//         }
//     }
// public static void main(String args[]){
//     String firstName = "Aakash";
//     // System.out.print(firstName.charAt(1));  
//     printLetters(firstName);  
// }
// }    
   

// 6.

// import java.util.*;    

// public class a {
//     public static int isPalindrome(String str){   
//         for(int i=0; i<str.length()/2; i++){
//             if(str.charAt(i) != str.charAt(str.length()-i-1)){
//                 return 0;
//             }
//         }  
//         return 1;
//     }

// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter the string: ");
   
//    String str = sc.nextLine();

//    if(isPalindrome(str) == 0){
//     System.out.println("is not Palindrome");
//    }
//    else{
//     System.out.println("is Palindrome");
//    }
// }

// }



// 7.
// Calculating distance from the origin.
// public class a{
//     public static float getShortestPath(String str){
//         int x = 0;
//         int y = 0;
        
//         int n = str.length();

//         for(int i = 0; i<n; i++){
//             if(str.charAt(i) == 'W'){
//                 x--;
//             }
//             if(str.charAt(i) == 'N'){
//                 y++;
//             }
//             if(str.charAt(i) == 'E'){
//                 x++;
//             }
//             if(str.charAt(i) == 'S'){
//                 y--;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);

//     }
// public static void main(String args[]){
//    String str = "WNEENES";
//    System.out.println("Shortest Path between points from the origin is "+getShortestPath(str)+" m");

// }

// }



// 8.
// public class a {
// public static void main(String args[]){
//     String s1 = "Tony";   
//     String s2 = "Tony";   
//     String s3 = new String("Tony");   

//     if(s1 == s2){
//         System.out.println("Strings are equal");
//     }
//     if(s1 == s3){
//         System.out.println("Strings are equal");
//     }
//     else{
        
//         System.out.println("Strings are not equal");
//     }
//     if(s1.equals(s3)){
//         System.out.println("Strins are equal");
//     }

// }

// }
  


// 9.

// public class a {
//     public static String substring(String str, int si, int ei){
//         String substr = "";
//         int n = str.length();
//         for(int i = 0; i<n; i++){
//             if(i>=si && i<ei){
//                 substr += str.charAt(i);
//             }
//         }
//         return substr;
//     }
// public static void main(String args[]){
//     String str = "Hello World";
//     int si = 2;
//     int ei = 5;
//     // System.out.println("Your string is: "+substring(str, 2, 5));
//     System.out.println(substring(str, 0, 5));

// }
  
// }


// 10.  

// public class a {

// public static void main(String args[]){
//    String fruits[] = {"apple", "mango", "banana"};     

//    String largest = fruits[0];
//    for(int i = 1; i<fruits.length; i++){
//       if(largest.compareTo(fruits[i])<0){
//         largest = fruits[i];
//       }
//    }
//    System.out.println("Largest string is: "+largest);
// }

// } 


// 11.

// public class a {
// public static void main(String args[]){
//     StringBuffer sb = new StringBuffer("");
//     for(char ch = 'a'; ch<='z'; ch++){
//         sb.append(ch);
//     }     
//     System.out.println(sb.length());

// }

// }




// 12.   

// public class a {
//     public static String toUppercase(String str){
//         StringBuffer sb = new StringBuffer();
        
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i = 1; i<str.length(); i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i)); 
//             }
//         }
//           return sb.toString();

//     }
//     public static void main(String args[]){
//         String str = "hello world";
//         System.out.println(toUppercase(str));
//     }
// }





// 13. By using StringBuffer

// public class a {
//     public static String stringCompression(String str){
//         StringBuffer sb = new StringBuffer();
//         int n = str.length();
//         for(int i = 0; i<n; i++){
//             Integer count = 1;
//             while(i<(n-1) && str.charAt(i) == str.charAt(i+1)){
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
//     String str = "aaabbcccdd";    
//     System.out.println(stringCompression(str));

// }

// }


// or

// public class a {
//     public static String stringCompression(String str){
//         String newstr = "";
//         int n = str.length();
//         for(int i = 0; i<n ; i++){
//             Integer count = 1;
//             while(i<(n-1) && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newstr += str.charAt(i);
//             if(count>1){
//                 newstr += count.toString();
//             }
//         }
//             return newstr.toString();
//     }
// public static void main(String args[]){
//     String str = "aaabbcddd";  
//     System.out.println(stringCompression(str));

// }

// }




