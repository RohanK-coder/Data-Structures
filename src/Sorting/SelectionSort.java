package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static int[] array = new int[]{7,4,6,8,2,3};
    public static void main(String[] args) {
        System.out.print("Array before Sorting ");
        System.out.println(Arrays.toString(array));
        selSort();
        System.out.println("After Sorting : "+ Arrays.toString(array));

    }
    public static void selSort(){
        int len = array.length;
        int min=0;
        int temp=0;
        for(int i=0;i<len-1;i++){
            min=i;
            for(int j=i+1;j<len;j++){
                if(array[j]<array[min]){
                    min=j;
                }


            }
            temp = array[i];
            array[i]=array[min];
            array[min]=temp;

        }
    }

}
