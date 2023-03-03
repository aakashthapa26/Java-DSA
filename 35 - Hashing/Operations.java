import java.util.*;
public class Operations{
    public static void main(String args[]){
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        // add - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        System.out.println(hm);

        //get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        //containsKey - O(1)
        System.out.println(hm.containsKey("India")); // --> true
        System.out.println(hm.containsKey("Indonesia")); // --> false

        //remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);
        
        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());
        
        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
        
        
    }
} 
