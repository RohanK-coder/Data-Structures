package Sorting;

public class InsertionSort {
    public static int[] arr = new int[]{12,1,6,13,4,2};
    public static void main(String[] args) {
        insertionSort(arr,arr.length);
    }
    public static void insertionSort(int[] arr, int length) {
        int temp=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                while(j>0 && arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;

                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
