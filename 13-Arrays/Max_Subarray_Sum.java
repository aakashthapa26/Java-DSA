public class Max_Subarray_Sum {
    public static void MaxSubarrays(int numbers[]){
        
        int MaxSum = Integer.MIN_VALUE;
        int count = 1;

        for(int i=0; i<numbers.length; i++){
            int start = i;

            for(int j=i; j<numbers.length; j++){
                int end = j;
                int currSum= 0;

                for(int k=start; k<=end; k++){
                    // subarray sum
                    currSum+=numbers[k];   
                }
                
                System.out.println("sum of " + count +" subarray is: "+currSum);
                count++;

                if(MaxSum < currSum){
                    MaxSum = currSum;
                }
            }
           
        }  
        System.out.println();
        System.out.println("Maximum sum of subArrays is: "+MaxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSubarrays(numbers);
    }
}

      

