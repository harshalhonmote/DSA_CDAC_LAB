package DSALAB.src.Tree.Heap;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    static int count=1;
    
    public static void heapify(int arr[],int n,int index){
        while(index < n/2){
            int left = 2*index+1;
            int right = 2*index+2;

            int largest = left;
            if(right < n && arr[right]>arr[left]){
                largest=right;
            }
            if(arr[index] < arr[largest]){
                int temp = arr[index];
                arr[index]=arr[largest];
                arr[largest]=temp;
            }
            else break;

            index = largest;
        }
    }

    public static void buildHeap(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; --i) {
            heapify(arr, n, i);
        }
    }
    public static void heapSort(int arr[], int n){
        for(int i=n-1;i>0;--i){
            int max = arr[0];
            arr[0]=arr[i];
            arr[i]=max;
            heapify(arr, i, 0);
        }
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
    public static void main(String[] args) {
        // HeapSort h = new HeapSort();
        int arr[] = new int[] {12, 11, 15, 1,17, 5, 8, 7,6 };
         // int arr[] = new int[7];
        // arr[0]=0;
        // addOne(arr);
        // addOne(arr);
        // addOne(arr);
        // addOne(arr);
        // addOne(arr);
        // addOne(arr);
        System.out.println(Arrays.toString(arr));
        buildHeap(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        heapSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
