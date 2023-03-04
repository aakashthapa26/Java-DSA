public class MultiLevel_Inheritance {
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.legs = 5;
        System.out.println(dobby.legs);
        dobby.eat();    
    
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}