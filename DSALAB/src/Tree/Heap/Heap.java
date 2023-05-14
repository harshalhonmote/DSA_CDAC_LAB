package DSALAB.src.Tree.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Heap {
    static int count=1;

    public void heapify(int arr[], int n, int parent) {
        int temp = arr[parent];
        int largest;
        while (parent < n/2) {
            int left = 2 * parent;
            int right = 2 * parent + 1;
            if (left < n && arr[left] > arr[right]) {
                largest = left;
            } else
                largest = right;

            if (temp > arr[largest])
                break;
            arr[parent] = arr[largest];

            parent = largest;
        }
        arr[parent] = temp;
        System.out.print("n:"+n+"p:"+parent+"->");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void maxHeap(int arr[], int n) {
        for (int i = n / 2; i > 0; --i) {
            heapify(arr, n, i);
        }
    }

    public void heapSort(int arr[], int n) {
        List<Integer>temp = new ArrayList<>();
        int k=n-1;
        for (int i =1; i <n; ++i) {
            int max = arr[1];
            arr[1] = arr[k];
            arr[k] = max;
            temp.add(max);
            System.out.print(" max:"+max+" ");
            heapify(arr, k, 1);
            k--;
        }
       // temp.forEach(e->System.out.print(e+" "));
       /*for (int i = n-1; i > 0; --i) {
        int max = arr[1];
        arr[1] = arr[i];
        arr[i] = max;
        temp.add(max);
        heapify(arr, i-1, 1);
        
    }*/
    }

    public void print(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
           // System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void addOne(int arr[]){
        System.out.print("Enter Element: ");
        int data = new Scanner(System.in).nextInt();
        if(count==1){
            arr[count++]=data;
        }else{
            arr[count]=data;
            heapify(arr, count, 1);
            count++;
        }
    }
}
