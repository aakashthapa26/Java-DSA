public class FibonacciNumber {
    public static int FibonacciNumber(int np){
        if(np == 0 || np == 1){
            return np;
        }
        else{
            return FibonacciNumber(np - 1) + FibonacciNumber(np - 2);
        }
    }
    public static void main(String args[]){
        int np = 5;
        System.out.println("Fibonacci Number is: "+FibonacciNumber(np));
    }         
}            
               