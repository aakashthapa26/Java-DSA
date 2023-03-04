// public class a {
//     public static void sorting(int n[]){
//         for(int turn = 0; turn<n.length-1; turn++){
//             int swap = 0;
//             for(int j = 0; j<(n.length-1-turn); j++){
//                 if(n[j] > n[j+1]){
//                     int temp = n[j];
//                     n[j] = n[j+1];
//                     n[j+1] = temp;
//                     swap++;
//                 }

//             } 
//         }
//     }

//     public static void printn(int n[]){
//         for(int i=0; i<n.length; i++){
//             System.out.print(n[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int n[] = {5,4,3,2,1};
//         sorting(n);
//         printn(n);  

//     }
// }




// public class a {
//     public static void SelectionSort(int n[]){
//         for(int i = 0; i<n.length-1; i++){
//             int minPos = i;
//             for(int j= i+1; j<n.length; j++){
//                 if(n[minPos] > n[j]){
//                     minPos = j;
//                 }
//             }
//             int temp = n[minPos];
//             n[minPos] = n[i];
//             n[i] = temp;
//         } 
//     }
//     public static void printn(int n[]){
//         for(int i=0; i<n.length; i++){
//             System.out.print(n[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int n[] = {5,4,3,2,1};
//         SelectionSort(n);
//         printn(n);  
  
//     }
// }


public class a{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }   

            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){     
        System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}
  