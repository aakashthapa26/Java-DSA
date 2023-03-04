public class Hybrid_Inheritance {
    public static void main(String args[]){
        Human h = new Human();
        h.bones = 206;
        h.Run();
        System.out.println(h.bones);  

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

class Tuna extends Fish{
    void color(){
        System.out.println("yellow");
    }
}

class Shark extends Fish{
    void color(){
        System.out.println("Light Blue");
    }
}

class Peacock extends Bird{
    void walks_fly(){
        System.out.println("Peacock can fly as well as walk");
    }
}

class Dog extends Mammal{
    void bite(){
        System.out.println("bites");
    }
}

class Cat extends Mammal{
    void jump(){
        System.out.println("jumps");
    }
}

class Human extends Mammal{
    int bones;
    void Run(){
        System.out.println("Runs");
    }
}