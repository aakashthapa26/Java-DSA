// Write a function to find the first occurence of an element in an array.

// Time Complexity - O(n) & Space Complexity - O(n)

public class ques7{
    public static int firstOccurence(int arr[], int key, int i){
        // Base Case:
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, key, i+1);

    }
    public static void main(String args[]){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        
        System.out.println("key is first occured at index "+firstOccurence(arr, key, 0));
    }
}