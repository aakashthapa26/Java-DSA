public class Factorial_of_n {
    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String args[]){
        int n = 5;  
        System.out.print("Factorial is: "+Factorial(n));
    }
}
