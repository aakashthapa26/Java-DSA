import java.util.*;
public class Course_Schedule_II{
    public int[] findOrder(int numCourses, int[][] prerequisites){
        int len = prerequisites.length;

        if(len==0){
            int[]res = new int[numCourses];
            for(int i=0; i<numCourses; i++){
                res[i]=i;
            }
            return res;
        }

        int[] pCounter = new int[numCourses];
        for(int i=0; i<len; i++){
            pCounter[prerequisites[i][0]]++;
        }

        LinkedList<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(pCounter[i] == 0){
                q.add(i);
            }
        }

         

    }
    public static void main(String args[]){
        int numcourses = 2;
        int[][] prerequisites = {{1,0}};


    }
}
