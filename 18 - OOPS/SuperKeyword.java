public class SuperKeyword {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal(){
        System.out.println("animal constructor is invoked");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
        // super();    
        System.out.println("horse contructor is invoked");
    }
}