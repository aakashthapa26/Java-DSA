// Write a Function to find the last occurence of an element in an array

public class ques8 {
    public static int lastOccurence(int arr[], int key , int i){
        // Base Class:
        if(i == 0){ 
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return lastOccurence(arr, key, i-1);
    }
    public static void main(String args[]){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int n = arr.length-1;
        System.out.print("key from last occurence is at index "+lastOccurence(arr, key, n));
    }
}
