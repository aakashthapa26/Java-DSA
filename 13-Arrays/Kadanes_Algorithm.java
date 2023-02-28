
// 11. General Kadanes Algorithm to find SumMaxSubarray in an array havaing numbers.

public class Kadanes_Algorithm {
    public static void MaxsubarraySum(int nums[]){
        int MaxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i<nums.length; i++){
            currSum = currSum + nums[i];
            MaxSum = Math.max(currSum,MaxSum);
            if(currSum<nums[i]){
                currSum = nums[i];
            }

        }
        System.out.print("MaxSum is: "+MaxSum); 
    }
public static void main(String args[]){
    int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
    MaxsubarraySum(nums);
}
}


