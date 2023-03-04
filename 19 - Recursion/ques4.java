// Print Sum of first n natural Numbers.

public class ques4 {
    public static int Calcsum(int n){
        if(n == 1){
            return 1;
        }
        return n + Calcsum(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(Calcsum(n));
    }
}
