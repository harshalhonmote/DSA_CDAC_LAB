package DSALAB.src.Tree.Heap;

import java.security.Principal;

public class Test {
    public static void main(String[] args) {
        Heap h = new Heap();
        //int arr[] = new int[]{0, 12, 11, 13, 5, 6, 7};
        int arr[] = new int[7];
        arr[0]=0;
        h.addOne(arr);
        h.addOne(arr);
        h.addOne(arr);
        h.addOne(arr);
        h.addOne(arr);
        h.addOne(arr);
       // h.maxHeap(arr, arr.length);
        //h.print(arr);
        h.heapSort(arr,arr.length);
        h.print(arr);
    }
}
