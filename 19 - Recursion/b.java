import java.nio.file.FileStore;

// 1.

// public class b {
//     public static void nmbs(int n){
//         if(n==1){
//             System.out.print(n);
//             return;  
//         }
//         System.out.print(n+" ");
//         nmbs(n-1);
//     }
// public static void main(String args[]){
//     int n = 5;
//     nmbs(n);
// }
// }


// 2.

// public class b {
//     public static void nmbs(int n){
//         if(n == 1){
//             System.out.print(n+" ");
//             return;
//         }
//         nmbs(n-1);
//         System.out.print(n+" ");
//     }
// public static void main(String args[]){
//    int n = 6;     
//    nmbs(n);
// }

// }


// 3.
// import java.util.*;
// public class b {
//     public static int factorial(int n){
//         if(n == 1 || n == 0){
//             return 1;
//         }
//         return n*factorial(n-1);
//     }
// public static void main(String args[]){
//   Scanner sc = new Scanner(System.in);
//   int n = sc.nextInt();
//   System.out.println("factorial of "+n+" is : "+factorial(n));

// }

// }


// 4. Sum of first n natural numbers

// public class b {
//     public static int sum(int n){
//         if(n==1){
//             return n;
//         }
//         return n + sum(n-1);
//     }
// public static void main(String args[]){
//    int n = 5;
//    System.out.println(sum(n));


// }

// }


// 5.

// public class b {
//     public static int Fibonacci(int place){
//         if(place == 1){
//             return 0;
//         }
//         if(place == 2){
//             return 1;
//         }
//         return Fibonacci(place-1)+Fibonacci(place-2);
//     }
// public static void main(String args[]){
//    int place = 5;     
//    System.out.println(Fibonacci(place));

// }

// }



// // 6.
// public class b {
//     public static int Fibonacci(int place){
//         if(place == 1){
//             return 0;
//         }
//         if(place == 2){
//             return 1;
//         }
//         return Fibonacci(place-1)+Fibonacci(place-2);
//     }
// public static void main(String args[]){
//    int place1= 5;  
//    int place2 = 6; 
//    int add = Fibonacci(place1) + Fibonacci(place2);  
//    System.out.println("Addition is: "+add);

// }

// }



// 7.
// public class b {
//     public static boolean isSorted(int array[], int i){
//         if(i == array.length - 1){
//             return true;
//         }
//         if(array[i] > array[i+1]){
//             return false;
//         }
//         return isSorted(array, i+1);
//     }
// public static void main(String args[]){
//    int array[] = {1, 2, 3, 4};   
//    System.out.print(isSorted(array,0));

// }

// }


// 8.

// public class b {
//     public static int firstOccurence(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         return firstOccurence(arr ,key, i+1);
//     }
// public static void main(String args[]){
//    int arr[] = {1, 2, 3, 4, 6, 7, 8};
//    int key = 5;
//    int i = 0;
//    System.out.println(firstOccurence(arr, key, i));

// }

// }


// 9. in doubt

// public class b {
//     public static int lastOccurence(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         int isFound = lastOccurence(arr, key, i+1);
//         if(isFound != -1){
//             return isFound;
//         }

//         //Check with Self
//         if(arr[i] == key){
//             return i;
//         }
//         return isFound;
//     }
// public static void main(String args[]){
//    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 5};
//    int key = 5;
//    int i = 0;  
//    System.out.println(lastOccurence(arr, key, i));   

// }

// }



// 10.

// public class b {
//     public static int power(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         return x * power(x, n-1);
//     }
// public static void main(String args[]){
//    int x = 2;
//    int n = 10;     
//    System.out.println(power(x, n));
// }

// }


// 11.

// public class b {
//     public static int optimizedPower(int x, int n){
//     if(n == 0){
//         return 1;
//     }
//      int halfPower = optimizedPower(x, n/2);
//      int halfPowerSq= halfPower*halfPower;

//      if(n%2 != 0){
//         halfPowerSq = x * halfPowerSq;
//      }
//      return halfPowerSq;
//     }
// public static void main(String args[]){
//     int x = 2;
//     int n = 10;
//     System.out.println(optimizedPower(x,n));
// }
// }


// 12.

public class b {
public static void main(String args[]){
        

}

}