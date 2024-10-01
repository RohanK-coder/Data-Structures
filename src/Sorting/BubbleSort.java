package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{23,45,63,56};
        bubbleSort(arr,arr.length);
    }
    public static void bubbleSort(int arr[], int n)
    {
        int temp = 0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
