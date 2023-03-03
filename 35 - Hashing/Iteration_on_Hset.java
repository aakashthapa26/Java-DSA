import java.util.*;
public class Iteration_on_Hset {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

// 1 METHOD -> Using Iterators

        // Iterator it = cities.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        
// 2 METHOD -> Using Enhanced for loop

        for(String city: cities){
            System.out.println(city);
        }
    }
}
