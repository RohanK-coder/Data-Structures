package ComplexProblems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,4,3,6,7};
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println(Arrays.toString(rotate(arr, 2)));
    }
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        for(int i=1;i<=k;i++)
        {

            int last = 0;
            //Rotation Test
            last = arr[n-1];

            for(int j=n-2;j>=0;j--){

                arr[j+1] = arr[j];

            }
            arr[0] = last;

        }
        return arr;
    }
}
