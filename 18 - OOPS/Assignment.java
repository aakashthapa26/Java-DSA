import java.util.*;
public class Assignment {
    public static void main(String args[]){
        System.out.println("Enter the real part of complex no: ");
        int real = new Scanner(System.in).nextInt();
        System.out.println("Enter the imaginary part of complex no: ");
        int imaginary = new Scanner(System.in).nextInt();

        complex c = new complex();
        System.out.println("Sum of complex no. is: "+c.Sum(real, imaginary));

    }
}

class complex{
    
    static int Sum(int a, int b){
        return a+b;
    }
    static int Difference(int a, int b){
        return a-b;
    }
    static int Product(int a, int b){
        return a*b;
    }
}