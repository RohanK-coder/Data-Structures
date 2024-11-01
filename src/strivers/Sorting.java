package strivers;

import java.util.Arrays;

public class Sorting {
    public static int[] arr = new int[]{4,5,2,3,1};
    public static void main(String[] args) {
        System.out.print("Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        System.out.print("After Sorting : ");
        //selectionSort();
        //bubbleSort();
        System.out.println(Arrays.toString(arr));


    }
    public static void swap(int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //Selection Sort Implementation
    public static void selectionSort(){
        int min;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(i,min);
        }
    }

    //Bubble Sort Implementation
    public static void bubbleSort(){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }
}
