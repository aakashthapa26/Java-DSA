// Subarrays - a continous part of array

public class Subarrays {
    public static void printSubarrays(int numbers[]){
        int ts = 0 ;   
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE; 

        for(int i = 0; i<numbers.length; i++){
            int start = i;

            for(int j=i; j<numbers.length; j++){
                int end = j;    
                int sum = 0;
                
                for(int k=start; k<=end; k++){ // print
                    System.out.print(numbers[k]+" ");  // subArrays
                    sum+=numbers[k];   
                }
                ts++;

                if(Largest < sum){
                    Largest = sum;
                }
                if(Smallest > sum){
                    Smallest = sum;  
                }

                System.out.println();
                System.out.println("sum of subarray is: "+sum);
                System.out.println();
                  
            } 
            System.out.println();
            
        }
        System.out.println("total subArrays = "+ts);
        System.out.println("MAXIMUM sum of subArray is: "+Largest);
        System.out.println("MINIMUM sum of subArray is: "+Smallest);

    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}


