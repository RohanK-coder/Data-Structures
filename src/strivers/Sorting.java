package strivers;

import java.util.Arrays;

public class Sorting {
    public static int[] arr = new int[]{4,5,2,3,1};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        

    }
    public static void swap(int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
