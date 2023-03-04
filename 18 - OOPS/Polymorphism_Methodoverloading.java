public class Polymorphism_Methodoverloading {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        int a = cal.sum(5,6);
        System.out.println(a);
        System.out.println(cal.sum((float)1.5, (float)2.5));
    }
}   

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}