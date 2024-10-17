package ComplexProblems;

import java.util.Arrays;

public class TopKLargest {
    public static void main(String[] args) {
        System.out.println("Top K Largest : "+ Arrays.toString(topkLargest(new int[]{1,1,1,2,2,3}, 2)));

    }
    public static int[]  topkLargest(int[] arr, int k) {
        int[] result = new int[k];
        int count,x;
        x=0;
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                if(count==k){
                    result[x] = arr[i];
                    x++;
                }
                if(x==1){
                    return result;
                }
                if(arr[i]==arr[j]){
                    count++;
                }
            }

        }
        return result;



    }
}
