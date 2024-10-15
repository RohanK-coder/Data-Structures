package ComplexProblems;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefixSum(new int[]{10, 20, 10, 5, 15})));
    }
    public static int[] prefixSum(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}
