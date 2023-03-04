public class Hierarchial_Inheritance {
    public static void main(String args[]){
        Fish a = new Fish();
        a.eat();
        a.swim();
        
        Bird b = new Bird();
        a.eat();
        b.fly();
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
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}