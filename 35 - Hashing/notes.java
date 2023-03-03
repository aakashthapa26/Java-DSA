/* What is Hashing?

By using some functions when we change a data or form of data, then this process is called
Hashing.
 

By using process of Hashing, We create 2 DataStructures i.e -> Map & Set.

1. Types of Map?

a) HashMap   b)LinkedHashMap   c)TreeMap

2. Types of Set?

a) HashSet   b)LinkedHashSet   c)TreeSet

 */

/* 1. In Hashmap, Time Complexity:

Hashmap is a D.S which is used to store Table of Information.
Hashmap is an unordered Map
insert, remove, search - O(1)

*/


/* 2. To import Hashmap:
    
Write either --> import java.util.*;
or ---> import java.util.HashMap;

*/


/* 3. To create HashMap

Write --> HashMap<Type of Key, Type of value> hm = new HashMap<>();

 */


/* 4. Operations of HashMap:

1. To add (key, value):

USE - put(key, value);

e.g: hm.put("India", 100);

2. To get value corresponding to key:

USE - get(key);

e.g: int population = hm.get("India");

3. To check whether key is present or not

USE - containsKey(Key);

e.g: System.out.println(hm.containsKey(Key));

4. To delete Key and return the value correspond to that key

USE - remove(key);

e.g: System.out.println(hm.remove("China"));

5. To know the size of Hashmap

USE - size();

e.g: System.out.println(hm.size());

6. To check whether HashMap is Empty or not

USE - isEmpty();

e.g: System.out.println(hm.isEmpty());

7. To clear HashMap

USE - hm.clear();

 */



 /*Iteration on HashMap - O(1)
  
 USE - for iteration use Set<Type> keys = hm.keySet(); 

       for(Type k: keys){
        
       }

  */


// Special Note: In Worst Case, Time Complexity of HashMap reaches --> O(n)



/*

***LinkedHashMap***

Note: Keys are insertion Ordered

1. To create

Write - LinkedHashMap<Key, Value> lhm = new LinkedHashMap<>();

LinkedHashMap has same operations as HashMap with same T.C - O(1)

 */



 /*

 ***TreeMap***
 
 Keys are Sorted on the basis of Key

 put,get,remove functions are of T.C -> O(logn)

 Implementation of TreeMap is done from Red-Black Trees
  
 1. To create

 Write - TreeMap<Key, Value> tm = new TreeMap<>();

*/



/*

***HashSet***

.No duplicates
.unordered
.Null is allowed

1. To create

Write - HashSet<Key Type> hs = new HashSet<>();

2. add(key) - O(1)

3. contains(key) - O(1)

4. remove(key) - O(1)

5. Iteration on HashSet

a. Using Iterators
b. Using Enhanced for loop

 */



/*LinkedHashSet

Ordered maintain using a Doubly LinkedList(DLL)

 */


 
/* TreeSet

. Sorted in ascending order 
. Null values are not allowed

 */


import java.util.*;
public class notes{
  public static void main(String args[]){
    int arr[] = {10,2,-2,-20,10};
    int k = -10;

    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int count = 0;

    map.put(0,1);

    for(int j=0; j<arr.length; j++){
      sum += arr[j];
      if(map.containsKey(sum-k)){
        count += map.get(sum-k);
      }
      map.put(sum, map.getOrDefault(sum, 0)+1);
    }

    System.out.println("Total Subarray with Sum as "+k+" = "+count);
  }

}


