public class Pairs_in_Array {
    public static void printPairs(int numbers[]){
        int n = numbers.length;
        int totalPairs = 0;
        for(int i = 0; i<n; i++){
            int curr = numbers[i];  // 2, 4, 6, 8, 10
            for(int j=i+1; j<n; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("totalPairs =  "+totalPairs);
    }
    public static void main(String args[]){  
        int numbers[] = {2, 4, 6, 8, 10};

        printPairs(numbers);
    
    }
}
