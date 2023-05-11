import java.util.Arrays;

public class MergeSort {

    public void merge(int arr[],int left,int mid,int right){
        int temp[]= new int[right-left+1];
      
        int i=left,j=mid+1,k=0;
      
        while(i<=mid && j<=right){
            temp[k++]=arr[i]>arr[j]?arr[j++]:arr[i++];
        }
        while(i<=mid)temp[k++]=arr[i++];
        while(j<=right)temp[k++]=arr[j++];
        
        for( i=0;i<right-left+1;++i){
            arr[i+left]=temp[i];
        }
    }
   public void mergeSort(int arr[],int left,int right){
        if(left==right)return;
        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr,left,mid,right);
   }

    public void print(int arr[]){
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }
    public static void main(String[] args) {
         int arr[]=new int[]{4,2,6,1,8,7,9};
         MergeSort q = new MergeSort();
        q.print(arr);
        q.mergeSort(arr, 0, arr.length-1);
        q.print(arr);
    }
}
