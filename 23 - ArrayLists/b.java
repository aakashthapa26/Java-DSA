
// import java.util.ArrayList;
// public class b {
//     public static void main(String args[]){
//         ArrayList<Integer> l = new ArrayList<>();
//         ArrayList<Boolean> l1 = new ArrayList<>();
//         ArrayList<String> l2 = new ArrayList<>();
//         l.add(1);
//         l.add(2);
//         l1.add(true);
//         l2.add("aakash");
//         System.out.println(l);
//         System.out.println(l1);
//         System.out.println(l2);
//     } 
// }


// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//   ArrayList<Integer> l = new ArrayList<>();
//   l.add(1);      
//   l.add(2);      
//   l.add(3);      

//   System.out.println(l);
//   int e = l.get(0);
//   System.out.println(e);
// }

// }


// To remove function

// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//    ArrayList<String> str = new ArrayList<>();
//    str.add("Elon Musk");   
//    str.add("Joff Besos");  
//    str.add("Aakash Thapa");     
//    str.add("Sundar Pichai");   

//    System.out.println(str);
//    str.remove(1);
//    System.out.println(str);


// }

// }


// Set Element at Index [Set function replaces previous element with present element at index(i)]

// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//     ArrayList<Integer> l = new ArrayList<>();
//     l.add(5);  
//     l.add(10);  
//     l.add(17);
    
//     System.out.println(l);
//     l.set(1 , 14);
//     System.out.println(l);

// }

// }


// contains

// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//    ArrayList <Integer> l = new ArrayList<>();
//    l.add(2);     
//    l.add(5);     
//    l.add(7);     
//    l.add(9);     
//    System.out.println(l);

//    System.out.println(l.contains(2));
//    System.out.println(l.contains(10));

// }

// }


// add

// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//    ArrayList<Integer> l = new ArrayList<>();
//    l.add(2);     
//    l.add(4);     
//    l.add(6);     

//    System.out.println(l);
//    l.add(1, 12);
//    System.out.println(l);

// }

// }


// 
// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//   ArrayList<Integer> l = new ArrayList<>();
//   l.add(1);
//   l.add(4);      
//   l.add(2);      
//   l.add(3);    
  
//   System.out.println(l.size());
//   for(int i=0; i<l.size(); i++){
//     System.out.print(l.get(i)+" ");
//   }

// }

// }


// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//    ArrayList<Integer> l = new ArrayList<>();
//    l.add(2);    
//    l.add(5);    
//    l.add(4);    
//    l.add(9);    
//    l.add(7);    

//    System.out.println(l);

//    for(int i=l.size()-1; i>=0; i--){
//        System.out.print(l.get(i)+" ");
//    }

//    System.out.println(l);
// }

// }


// import java.util.ArrayList; 
// public class b {
// public static void main(String args[]){
//   ArrayList<Integer> l = new ArrayList<>();
//   l.add(4);      
//   l.add(7);      
//   l.add(5);   
  
//   System.out.println(l);

//   int Max = Integer.MIN_VALUE;
//   for(int i = 0; i<l.size(); i++){
//     if(l.get(i) > Max){
//         Max = l.get(i);
//     }
//   }
//   System.out.println(Max);

// }

// }



// import java.util.ArrayList;

// public class b{
//    public static void swap(ArrayList<Integer> l, i)
// public static void main(String args[]){
//   ArrayList<Integer> l = new ArrayList<>();
//   l.add(4);
//   l.add(5);    
//   l.add(3);    
//   l.add(2);    
//   l.add(9);    

//   System.out.println(l);

// }

// }


// import java.util.ArrayList;
// import java.util.Collections;
// public class b{
//    public static void main(String args[]){
//       ArrayList<Integer> l = new ArrayList<>();
//       l.add(12);
//       l.add(10);
//       l.add(6);
//       l.add(8);
//       l.add(2);

//       System.out.println(l);
//       Collections.sort(l);
//       System.out.println(l);

//       Collections.sort(l, Collections.reverseOrder());
//       System.out.println(l);

//    }
// }   

 
// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//   ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
//   ArrayList<Integer> List = new ArrayList<>();
  
//   List.add(1); List.add(2);
//   MainList.add(List);

//   ArrayList<Integer> List2 = new ArrayList<>();
//   List2.add(3); List2.add(4);
//   MainList.add(List2);

//   for(int i=0; i<MainList.size(); i++){
//    ArrayList<Integer> currList = new ArrayList<>();
//    for(int j=0; j<currList.size(); j++){
//       System.out.print(currList.get(j)+" ");
//    }
//    System.out.println();
//   }
//   System.out.print(MainList);
// }

// }


// import java.util.ArrayList;
// public class b {
// public static void main(String args[]){
//   ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
//   ArrayList<Integer> l1 = new ArrayList<>();
//   ArrayList<Integer> l2 = new ArrayList<>();
//   ArrayList<Integer> l3 = new ArrayList<>();
  
//   for(int i=1; i<=5; i++){
//    l1.add(i*2);
//    l2.add(i*3);
//    l3.add(i*4);
//   }
//   MainList.add(l1);
//   MainList.add(l2);
//   MainList.add(l3);


//   System.out.println(MainList);
      
//   for(int i=0; i<MainList.size(); i++){
//    ArrayList<Integer> currList = MainList.get(i);
//    for(int j=0; j<currList.size(); j++){
//       System.out.print(currList.get(j)+" ");
//    }
//    System.out.println();       
//   }
// }     

// }     


// import java.util.ArrayList;
// public class b {
//   public static int storeWater(ArrayList<Integer> height){
//     int maxWater = 0;
//     // Brute Force
//     for(int i=0; i<height.size(); i++){
//       for(int j=i+1; j<height.size(); j++){
//          int ht = Math.min(height.get(i), height.get(j));
//          int width = j-i;
//          int currWater = ht * width;
//          maxWater = Math.max(currWater, maxWater);
//       }
//     } 
//     return maxWater;
//   }
// public static void main(String args[]){
//   ArrayList<Integer> height = new ArrayList<>();
  
//   height.add(1);    
//   height.add(8);    
//   height.add(6);    
//   height.add(2);    
//   height.add(5);    
//   height.add(4);    
//   height.add(8);    
//   height.add(3);    
//   height.add(7);    

//  System.out.println(storeWater(height));

// }

// }


// import java.util.ArrayList;
// public class b {
//   public static int storeWater(ArrayList<Integer> height){
//     int maxWater = 0;
//     int lp = 0;
//     int rp = height.size()-1;
//     while(lp<rp){
//       int ht = Math.min(height.get(lp), height.get(rp));
//       int width = rp -lp;
//       int currWater = ht * width;
//       maxWater = Math.max(maxWater, currWater);
      
//       if(height.get(lp) < height.get(rp)){
//         lp++;
//       }
//       else{
//         rp--;
//       }
//     }
//     return maxWater;
//   }
// public static void main(String args[]){
//   ArrayList<Integer> height = new ArrayList<>();
  
//   height.add(1);    
//   height.add(8);    
//   height.add(6);    
//   height.add(2);    
//   height.add(5);    
//   height.add(4);    
//   height.add(8);    
//   height.add(3);    
//   height.add(7);    

//  System.out.println(storeWater(height));

// }
// }


// import java.util.ArrayList;
// public class b {
//     public static boolean pairSum(ArrayList<Integer> list, int target){
//         for(int i=0; i<list.size(); i++){
//             for(int j=i+1; j<list.size(); j++){
//                 if(list.get(i)+list.get(j)== target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// public static void main(String args[]){
//   ArrayList <Integer> list = new ArrayList<>();
//   list.add(1);      
//   list.add(2);      
//   list.add(3);      
//   list.add(4);      
//   list.add(5);      
//   list.add(6);      
  
//   int target = 5;
//   System.out.println(pairSum(list, target));
// }

// }


// import java.util.ArrayList;
// import java.util.Collections;
// public class b {
//     public static boolean pairSum(ArrayList<Integer> list, int target){
//         int lp=0;
//         int rp = list.size()-1;
//         while(lp<rp){
//             if(list.get(lp)+list.get(rp) == target){
//                 return true;
//             }
//             if(list.get(lp)+list.get(rp)<target){
//                 lp++;
//             }
//             if(list.get(lp)+list.get(rp)>target){
//                 rp--;
//             }
//         }
//         return false;
//     }
// public static void main(String args[]){
//   ArrayList <Integer> list = new ArrayList<>();
//   list.add(6);      
//   list.add(1);      
//   list.add(4);      
//   list.add(3);      
//   list.add(2);      
//   list.add(5);   
//   int target = 5;  

//   Collections.sort(list);
//   System.out.println(pairSum(list, target));
// }

// }   


// import java.util.ArrayList;
// public class b {
//     public static boolean pairSum(ArrayList<Integer> list, int target){
//         int bp = -1;
//         for(int i=0; i<list.size(); i++) {
//             if(list.get(i) > list.get(i+1)) {
                 
//             } 
//         }
//     }
// public static void main(String args[]){
//    ArrayList<Integer> l = new ArrayList<>();
//    l.add(11);     
//    l.add(15);     
//    l.add(6);     
//    l.add(8);     
//    l.add(9);     
//    l.add(10);   

//    int target = 16;
//    System.out.print(pairSum(l, target));

// }

// }


import java.util.ArrayList;
public class b {
    public static boolean isMonotone(ArrayList<Integer> nums){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) > nums.get(i+1)){
                
            }
        }
    }
public static void main(String args[]){
   ArrayList<Integer> nums = new ArrayList<>();
   nums.add(1);     
   nums.add(3);     
   nums.add(2);        
   System.out.println(isMonotone(nums));   

}

}