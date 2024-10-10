package Sorting;
import java.util.Arrays;

import static java.util.Arrays.*;

public class IsSorted {
    public static void main(String[] args) {
        IsSorted obj = new IsSorted();
        int[] nums = new int[]{6,1,2,3,4,5};
        System.out.println(obj.isSorted(nums));
    }
    public boolean isSorted(int[] arr) {

            int[] testArr = arr;
            Arrays.sort(arr);

            return testArr == arr;
    }
}
