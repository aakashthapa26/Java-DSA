// Find kth largest value in given Array 

// import java.util.*;
// public class practiceset{
	
// 	// By the use of MaxHeap
// 	public static int kthLargest(int arr[], int k){
// 		if(arr.length < k){
// 			System.out.println("Invalid Case");
// 			return -1;
// 		}

// 		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// 		for(int i=0; i<arr.length; i++){
// 			maxHeap.add(arr[i]);
// 		} 

// 		for(int i=0; i<k-1; i++){
// 			maxHeap.remove();
// 		}

// 		return maxHeap.peek();
// 	}

	// By the use of MinHeap
	// public static int kthLargest(int arr[], int k){
	// 	if(arr.length < k){
	// 		System.out.println("Invalid Case");
	// 		return -1;
	// 	}

	// 	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	// 	for(int i=0; i<k; i++){
	// 		minHeap.add(arr[i]);
	// 	}

	// 	for(int i=k; i<arr.length; i++){
	// 		if(arr[i] > minHeap.peek()){
	// 			minHeap.remove();
	// 			minHeap.add(arr[i]);
	// 		}
	// 	}

	// 	return minHeap.peek();
	// }
// 	public static void main(String args[]){
// 		int arr[] = {10,20,11,70,50,40,100,120,5};
//         int k = 3;

// 		System.out.println(k+" Largest value in an array is: "+kthLargest(arr, k));

// 	}
// }



// 1. Find kth Largest in Stream of numbers

// import java.util.*;
// public class practiceset{
	
// 	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// 	public int add(int num, int k){

// 		if(minHeap.size() < k){
// 			minHeap.add(num);
// 			return minHeap.size() == k ? minHeap.peek() : -1;
// 		}

// 		if(num > minHeap.peek()){
// 			minHeap.remove();
// 			minHeap.add(num);
// 		}

// 		return minHeap.peek();
// 	}
// 	public static void main(String args[]){
// 		int stream[] = {10,7,11,5,27,8,9,45};
// 		int k = 3;

// 		practiceset a = new practiceset();

// 		for(int i=0; i<stream.length; i++){
// 			System.out.println(k+" Largest value for "+(i+1)+" element in a stream is: "+a.add(stream[i], k));
// 		}
// 	}
// } 



// 2. Code needs to be written(Not a generalized Solution) 

// import java.io.*;
// import java.util.*;
// class p{

// 	// Function to return the minimum
// 	// time to fill all the slots
// 	public static void minTime(int arr[],
// 							int N, int K)
// 	{
		
// 		// Stores visited slots
// 		Queue<Integer> q = new LinkedList<>();

// 		// Checks if a slot is visited or not
// 		boolean vis[] = new boolean[N + 1];
// 		int time = 0;

// 		// Insert all filled slots
// 		for (int i = 0; i < K; i++) {

// 			q.add(arr[i]);
// 			vis[arr[i]] = true;
// 		}

// 		// Iterate until queue is
// 		// not empty
// 		while (q.size() > 0) {

// 			// Iterate through all slots
// 			// in the queue
// 			for (int i = 0; i < q.size(); i++) {

// 				// Front index
// 				int curr = q.poll();

// 				// If previous slot is
// 				// present and not visited
// 				if (curr - 1 >= 1 &&
// 					!vis[curr - 1]) {
// 					vis[curr - 1] = true;
// 					q.add(curr - 1);
// 				}

// 				// If next slot is present
// 				// and not visited
// 				if (curr + 1 <= N &&
// 					!vis[curr + 1]) {

// 					vis[curr + 1] = true;
// 					q.add(curr + 1);
// 				}
// 			}

// 			// Increment the time
// 			// at each level
// 			time++;
// 		}

// 		// Print the answer
// 		System.out.println(time);
// 	}

// 	// Driver Code
// 	public static void main(String[] args)
// 	{
// 		int N = 5;  
// 		int arr[] = {1,2,3,4,5};
// 		int K = arr.length;

// 		// Function Call
// 		minTime(arr, N, K);
// 	}
// }


// 4. minimum opertions to Halve Array Sum

// 1 Approach - By using ArrayList

// import java.util.*;

// class practiceset{
// static int minops(ArrayList<Integer> nums)
// {
// 	int sum = 0;
// 	for(int i = 0 ; i < nums.size() ; i++){
// 	sum += nums.get(i);
// 	}

// 	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
// 	for(int i = 0 ; i < nums.size() ; i++){
// 	pq.add(-nums.get(i));
// 	}

// 	double temp = sum;
// 	int cnt = 0;
// 	while (temp > sum / 2) {
// 	int x = -pq.peek();
// 	pq.remove();
// 	temp -= Math.ceil(x * 1.0 / 2);
// 	pq.add(x / 2);
// 	cnt++;
// 	}

// 	return cnt;
// }
// public static void main(String args[])
// {
// 	ArrayList<Integer> nums = new ArrayList<Integer>(
// 	List.of(
// 		4, 6, 3, 9, 10, 2
// 	)
// 	);
// 	int count = minops(nums);
// 	System.out.println(count);
// }
// }


// 2 Approach - By using Array

// import java.util.*;
// public class practiceset{

// 	public static int count(int arr[]){
// 		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
// 		int sum1 = 0;
// 		for(int i=0; i<arr.length; i++){
// 			maxheap.add(arr[i]);
// 			sum1+=arr[i];
// 		}

// 		double sum2 = 0;
// 		int count = 0;

// 		// logic 
// 		while((sum2 < sum1/2)){
// 			int x = maxheap.peek();
// 			maxheap.poll();
// 			sum2 += (x * 1.0/2);
// 			maxheap.add(x/2);
// 			count ++;
// 		}
// 		//

// 		return count;

// 	}
// 	public static void main(String args[]){
// 		int arr[] = {4, 6, 3, 9, 10, 2};
		
// 		System.out.println(count(arr));

// 	}
// }


// 5. Merge K Sorted linked List

// public class practiceset{
// 	class Node{
// 		int data;
// 		Node next;

// 		Node(int data){
// 			this.data = data;
// 			this.next = null;
// 		}
// 	}

// 	class Node implements Comparable<Node>{
// 		public int compare(Node k1, Node k2){
// 			if(k1.data > k2.data){
// 				return 1;
// 			}
// 			else if(k1.data < k2.data){
// 				return -1;
// 			}
// 			return 0;
// 		}
// 	}
// public static void main(String args[]){

// 	int N = 3;
// 	Node a[] = new Node[N];

// 	Node head1 = new Node(1);
// 	a[0] = head1;

// 	head1.next = new Node(3);
// 	head1.next.next = new Node(5);
// 	head1.next.next.next = new Node(7);
	
// 	Node head2 = new Node(2);
// 	a[1] = head2;
// 	head2.next = new Node(4);
// 	head2.next.next = new Node(6);
// 	head2.next.next.next = new Node(8);

// 	Node head3 = new Node(0);
// 	a[2] = head3;
// 	head3.next = new Node(9);
// 	head3.next.next = new Node(10);
// 	head3.next.next.next = new Node(11);

	
// }
// }









import java.io.*;
import java.util.*;

public class practiceset{
class Node {
	int data;
	Node next;
	Node(int key){
	data = key;
	next = null;
}
}

class NodeComparator implements Comparator<Node> {
public int compare(Node k1, Node k2){
if (k1.data > k2.data)
return 1;
else if (k1.data < k2.data)
return -1;
return 0;
}


}
class Solution {
static Node mergeKList(Node[] arr, int K){
PriorityQueue<Node> queue
= new PriorityQueue<>(new NodeComparator());
Node at[] = new Node[K];
Node head = new Node(0);
Node last = head;
for (int i = 0; i < K; i++) {
if (arr[i] != null) {
queue.add(arr[i]);
}
}
if (queue.isEmpty())
return null;
while (!queue.isEmpty()) {
Node curr = queue.poll();
last.next = curr;
last = last.next;
if (curr.next != null) {
queue.add(curr.next);
}
}
return head.next;
}
public static void printList(Node node){
while (node != null) {
System.out.print(node.data + " ");
node = node.next;
}
}
public static void main(String[] args){
int N = 3;
Node[] a = new Node[N];
Node head1 = new Node(1);
a[0] = head1;
head1.next = new Node(3);
head1.next.next = new Node(5);
head1.next.next.next = new Node(7);


Node head2 = new Node(2);
a[1] = head2;
head2.next = new Node(4);
head2.next.next = new Node(6);
head2.next.next.next = new Node(8);
Node head3 = new Node(0);
a[2] = head3;
head3.next = new Node(9);
head3.next.next = new Node(10);
head3.next.next.next = new Node(11);

Node res = mergeKList(a, N);

	if (res != null){
		printList(res);
		System.out.println();

	}
	
	}
	}
}