// public class Abstract_Class {
//     public static void main(String args[]){
//         Horse h = new Horse();
//         h.eat();
//         h.walk();

//         System.out.println(h.color);

//         Chicken c = new Chicken();
//         c.eat();
//         c.walk();

//     }
// }

// abstract class Animal {
//     String color;

//     Animal() {
//         color = "brown";
//     }
//     void eat(){  // Non Abstract Method
//         System.out.println("animal eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal{
//     void changeColor(){
//         color = "dark brown";
//     }
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     void changeColor(){
//         color = "yellow";
//     }
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }





public class Abstract_Class {
    public static void main(String args[]){
        Mustang myhorse = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor invoked");
    }
    void eat(){  // Non Abstract Method
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse() {
        System.out.println("Horse Constructor invoked");
    }
    void changeColor(){
        color = "dark brown"; 
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang() {
        System.out.println("Mustang Constructor invoked");
    }
} 


