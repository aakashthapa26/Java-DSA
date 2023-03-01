// import java.util.*;

// public class Creation_of_2D_Arrays {
//     public static void search(int matrix[][], int key ){
//       int n = matrix.length, m = matrix[0].length;
//       int smallest = Integer.MAX_VALUE;
//       int largest = Integer.MIN_VALUE;

//       for(int i= 0; i<n; i++){
//         for(int j=0; j<m; j++){
//           if(matrix[i][j] == key){
//             System.out.println("found at cell (" + i + "," + j + ")");
//           }
          
//           if(matrix[i][j] > largest){
//             largest = matrix[i][j];
//           }

//           if(matrix[i][j] < smallest){
//             smallest = matrix[i][j];
//           }
//         }       
//     }

//       System.out.println("Smallest number is: "+ smallest);
//       System.out.println("largest number is: "+ largest);
      
//     }
    
//     public static void main(String args[]){
        
//     int matrix[][] = new int[3][3];
//     int n = matrix.length, m = matrix[0].length;
//     int key = 5;

//     Scanner sc = new Scanner(System.in);
//         for(int i= 0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i] [j] = sc.nextInt();
//             }   
            
//         }  
            
//         // output
//         for(int i= 0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, key);  
//     }
// }  
  


