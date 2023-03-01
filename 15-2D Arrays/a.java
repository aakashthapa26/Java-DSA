// public class a {
//     public static int diagonalSum(int matrix[][]){
//         int sum = 0;
//         for(int i = 0; i<matrix.length; i++){
//             sum += matrix[i][i];
//             if(i != matrix[0].length){
//                 sum += matrix[i][matrix.length-i-1];
//             }
//         }
//             return sum;
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {9,10,11,12},
//                           {13,14,15,16}};
//         System.out.print(diagonalSum(matrix));
//     }
// }


// import java.util.*;

// public class a {
//     public static void check(int matrix[][]){
//         int n = matrix.length , m = matrix[0].length;
//         int smallest = Integer.MAX_VALUE;
//         int largest = Integer.MIN_VALUE;
//         int a = 0, b = 0;
        
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m ; j++){
        //         if(matrix[i][j] == key){
        //             System.out.print("key found at index ("+i+","+j+")");
        //             return true;
        //         }
        //     }
        // }
        //     System.out.print("key not found!");
        //     return false;

//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<m ; j++){
//                 if(matrix[i][j] > largest){
//                     largest = matrix[i][j];
//                      a = i;
//                      b = j;
                    
//                 if(matrix[i][j] < smallest){
//                     smallest = matrix[i][j]; 
//                     a = i;
//                     b = j;
                    
//                 }
//             }
//         }
//     }
//     System.out.println("Largest number in the matrix is: "+largest+" at index ("+a+","+b+")");
//     System.out.println("Smallest number in the matrix is: "+smallest+" at index ("+a+","+b+")");
    
// }
// public static void main(String args[]){
//     int matrix[][] = new int[3][3];
//     // int key = 8;
//     Scanner sc = new Scanner(System.in);
    
//     for(int i=0; i<matrix.length; i++){
//         for(int j = 0; j<matrix[0].length; j++){
//             System.out.print("Enter the value of ("+i+","+j+") : ");
//             matrix[i][j] = sc.nextInt();
//         }
//     }

//     for(int i=0; i<matrix.length; i++){
//         for(int j = 0; j<matrix[0].length; j++){
//            System.out.print(matrix[i][j] + " ");
//         }
//         System.out.println();
//     }
    
//     check(matrix);
// }   

// }



// public class a {
//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while(startRow<=endRow && startCol<=endCol){
//             for(int j=startCol; j<=endCol; j++){
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             for(int i = startRow+1; i<=endRow; i++){
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             for(int j= endCol-1; j>=startCol; j--){
//                 if(startRow == endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }
//             for(int i=endRow-1; i>=startRow+1; i--){
//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         } 
//         System.out.println();
//     }     
// public static void main(String args[]){
//     int matrix[][] = {{1,2,3,4},
//                       {5,6,7,8},
//                       {9,10,11,12},
//                       {13,14,15,16}};

//         printSpiral(matrix);
           
// }
// } 