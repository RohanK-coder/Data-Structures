package strivers;

import java.util.ArrayList;

public class MergeSort {
    //for dividing
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,4,1,2};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low<=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }

    //for the individual merging
    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;

        // Here, we check for the elements to be added into the list
        while(left<=mid&&right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
            }
        }

        //Here, we add any leftover elements from the left side
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        //Here, we add any leftover elements from the right side
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        // Transferring the values from temporary list to the original array
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i);
        }

    }
}
