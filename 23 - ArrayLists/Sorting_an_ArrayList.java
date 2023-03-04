// import java.util.ArrayList;
// import java.util.Collections;

import java.util.*;

public class Sorting_an_ArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(8);
        l.add(2);
        l.add(9);
        l.add(4);

        System.out.println(l);
        Collections.sort(l);   // This is the Method (Ascending order).
        System.out.println(l);
        
        // descending order
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);
        // Comparator - fnx logic
    } 
}
