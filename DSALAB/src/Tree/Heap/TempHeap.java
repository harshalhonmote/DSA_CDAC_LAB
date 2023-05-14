package DSALAB.src.Tree.Heap;

import java.util.*;
public class TempHeap  {
	//Solution 1, Iteration, Time O(nlogn), Space O(1)
	public static void heapSort(int[] a) {
		int n = a.length;
		for(int i = n/2-1; i >= 0; i--) {//make the array a max heap
			heapify(a, n, i);
		}		
        for (int i = 0; i < n; i++) { //sort by remove the largest and put at the end
        	int size = n-i-1; //new size after remove last
        	a[size] = remove(a, size, i); //put the largest at the end
        }     
	}
	//Remove the root from heap and heapify again, Time O(logn), Space O(1)
	public static int remove(int[] a, int size, int i) {	
		int max = a[0];
		a[0] = a[size]; //put last at front
		heapify(a, size, 0);		
		return max;
	}
	
	//Max heapify, put larger at top,  Time O(logn), space O(1)
	private static void heapify(int[] a, int size, int i) {
		int top = a[i];
		int larger;
		while (i < size/2) { // from top down, swap with larger child
			int left = 2*i + 1;
			int right = 2*i + 2;
			if (right < size && a[right] > a[left]) 
				larger = right;
			else
				larger = left;
			if (top >= a[larger]) 
				break;
			a[i] = a[larger];
			i = larger;					
		}
		a[i] = top;
	}
	public static void main(String[] args) {	
		int[] a = {19, 33, 4 , 61, 5, 38, -36, 21, 0};		
		heapSort(a);
		System.out.print("Heap sort:" + Arrays.toString(a));
	}
}
