package ComplexProblems;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4,5};
        List<Integer> list = new ArrayList<>();
        int prod;
        for(int i=0;i<nums.length;i++){
            prod=1;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                prod*=nums[i];
            }
            list.add(prod);
        }
        System.out.println(list.toString());
    }
}
