// To Add Element

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);
//     }
// }
   

// To Get Element (Operation) - O(1)

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         int element = list.get(2);
//         System.out.println(element);
//     }
// }



// Remove Element - O(n)

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         list.remove(2);
//         System.out.println(list);

//     }
// }   



// Set Element at Index - O(n)

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         list.set(2, 10);
//         System.out.println(list);

//     }
// }   



// Contains Element - O(n)

// import java.util.ArrayList;

// public class Operations {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1); // O(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         // contains
//         System.out.println(list.contains(1));
//         System.out.println(list.contains(11));
//     }
// }   



// Addition of number in between numbers

import java.util.ArrayList;

public class Operations {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(1, 9);  // O(n)
        System.out.println(list);
    }
}  

