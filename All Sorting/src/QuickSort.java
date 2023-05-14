import java.util.Arrays;

public class QuickSort {
    
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int findpivotLeft(int arr[],int left,int right){
        int i =left,j=right;
        int pivot =left;
        while(i < j){
             while(i <= right && arr[i]<=arr[pivot])i++;
             while(j >= left && arr[j]>arr[pivot]) j--;
            if(i<j)swap(arr, i, j); 
        }
        swap(arr, pivot, j);
        return j;
    }
    public int findpivotRight(int arr[],int left,int right){
        int i =left,j=right;
        int pivot =right;
        while(i < j){
             while(i <= right && arr[i]<arr[pivot])i++;
             while(j >= left && arr[j]>=arr[pivot]) j--;
            if(i<j)swap(arr, i, j); 
        }
        swap(arr, pivot, i);
        return i;
    }
    public void quickSort(int arr[],int left,int rigth){
        if(left >= rigth)return;
        int pivot = findpivotLeft(arr,left,rigth);
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, rigth);
    }
    public void print(int arr[]){
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,6,1,8,7,9};
        QuickSort q = new QuickSort();
        q.print(arr);
        q.quickSort(arr, 0, arr.length-1);
        q.print(arr);
    }
}
